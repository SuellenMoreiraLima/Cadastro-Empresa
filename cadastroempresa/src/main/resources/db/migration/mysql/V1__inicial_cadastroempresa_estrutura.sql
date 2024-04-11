DROP TABLE IF EXISTS `alarm`;
CREATE TABLE `cadastro` (
                         `id` int(11) NOT NULL AUTO_INCREMENT,
                         `email` varchar(45) DEFAULT NULL,
                         `nomeFantasia` varchar(45) DEFAULT NULL,
                         `sobrenomeSocial` varchar(45) DEFAULT NULL,
                         `empresa` varchar(45) DEFAULT NULL,
                         PRIMARY KEY (`id`,`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;