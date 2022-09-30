-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mer. 29 août 2018 à 05:59
-- Version du serveur :  5.7.21
-- Version de PHP :  5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `behome`
--
CREATE DATABASE IF NOT EXISTS `behome` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `behome`;

-- --------------------------------------------------------

--
-- Structure de la table `agent`
--

DROP TABLE IF EXISTS `agent`;
CREATE TABLE IF NOT EXISTS `agent` (
  `idAgent` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `nbBien` int(10) NOT NULL,
  `idClient` int(10) NOT NULL,
  PRIMARY KEY (`idAgent`) USING BTREE,
  KEY `idClient` (`idClient`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `agent`
--

INSERT INTO `agent` (`idAgent`, `nom`, `prenom`, `nbBien`, `idClient`) VALUES
(1, 'Barbaca', 'dauphin', 1, 1),
(2, 'barbara', 'mathieuX2', 2, 2),
(3, 'barbara', 'mathieu', 1, 3),
(4, 'barbara', 'mathieuX', 1, 4),
(8, 'Pierre', 'Paul', 0, 6),
(9, 'Pablo', 'picasso', 4, 6),
(11, 'Pablo', 'picasso', 4, 6);

-- --------------------------------------------------------

--
-- Structure de la table `bien`
--

DROP TABLE IF EXISTS `bien`;
CREATE TABLE IF NOT EXISTS `bien` (
  `idBien` int(50) NOT NULL AUTO_INCREMENT,
  `type` varchar(50) DEFAULT NULL,
  `surface` int(10) DEFAULT NULL,
  `prix` int(10) DEFAULT NULL,
  `ville` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idBien`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `bien`
--

INSERT INTO `bien` (`idBien`, `type`, `surface`, `prix`, `ville`) VALUES
(1, 'garage', 12, 12000, 'paris'),
(2, 'garage', 10, 12000, 'chartes'),
(3, 'maison', 35, 140000, 'paris'),
(4, 'appart', 80, 450000, 'paris'),
(5, 'chateau', NULL, NULL, NULL),
(6, 'appart', 45, 350000, 'paris');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `idClient` int(50) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `nbBien` int(50) NOT NULL,
  `idBien` int(50) NOT NULL,
  PRIMARY KEY (`idClient`) USING BTREE,
  KEY `idBien` (`idBien`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`idClient`, `nom`, `prenom`, `nbBien`, `idBien`) VALUES
(1, 'James', 'Brown', 1, 1),
(2, 'Sinatra', 'Franck', 0, 6),
(3, 'Aretha', 'Frankline', 1, 2),
(4, 'bibi', 'phoque', 1, 3),
(5, 'dinnosaurre', 'denver', 1, 4),
(6, 'schwarzy', 'arnold', 1, 5);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `agent`
--
ALTER TABLE `agent`
  ADD CONSTRAINT `agent_ibfk_1` FOREIGN KEY (`idClient`) REFERENCES `client` (`idClient`);

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `client_ibfk_1` FOREIGN KEY (`idBien`) REFERENCES `bien` (`idBien`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
