/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : supermarket

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-06-24 02:54:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `realname` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `telephone` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', 'admin', '123456', '阿华', '545123456@qq.com', '15358845456');
INSERT INTO `account` VALUES ('2', 'admin1', '123456', '阿西', '564513245@qq.com', '15489755633');

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `telephone` varchar(20) NOT NULL,
  `employdate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '张三', '127546552@qq.com', '15956466221', '2016-07-11');
INSERT INTO `employee` VALUES ('2', '李四', '436562313@qq.com', '15898932465', '2017-04-12');
INSERT INTO `employee` VALUES ('3', '陈瑞', '456451321@qq.com', '15464846532', '2017-03-12');
INSERT INTO `employee` VALUES ('4', '华斯', '798845412@qq.com', '15456875321', '2016-09-22');
INSERT INTO `employee` VALUES ('5', '刘东', '454515875@qq.com', '15484322656', '2016-04-12');
INSERT INTO `employee` VALUES ('6', '阿玉', '546578945@qq.com', '15489232656', '2016-04-19');
INSERT INTO `employee` VALUES ('7', '阿强', '156415112@qq.com', '12234564874', '2016-11-11');

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `inprice` float NOT NULL,
  `saleprice` float NOT NULL,
  `qualityguarantee` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '脉动', '3', '4', '365');
INSERT INTO `product` VALUES ('2', '薯条', '5', '6.5', '712');
INSERT INTO `product` VALUES ('3', '黑人牙膏', '12', '13.5', '365');
INSERT INTO `product` VALUES ('4', '老酸奶', '4.5', '6', '180');
INSERT INTO `product` VALUES ('5', '冰红茶', '2', '3.5', '365');
INSERT INTO `product` VALUES ('6', '果味糖', '5', '7', '365');
INSERT INTO `product` VALUES ('7', '冰糖雪梨', '2', '3.5', '365');
INSERT INTO `product` VALUES ('8', '辣条', '1.5', '3', '712');
INSERT INTO `product` VALUES ('9', '饼干', '5', '7', '365');
INSERT INTO `product` VALUES ('10', '西瓜', '5', '10', '10');
INSERT INTO `product` VALUES ('11', '苹果', '5', '7', '10');
INSERT INTO `product` VALUES ('12', '香蕉', '2', '4', '10');
INSERT INTO `product` VALUES ('13', '梨', '5', '7', '10');
INSERT INTO `product` VALUES ('14', '菠萝', '8', '15', '10');
INSERT INTO `product` VALUES ('15', '榴莲', '15', '20', '10');

-- ----------------------------
-- Table structure for `purchase`
-- ----------------------------
DROP TABLE IF EXISTS `purchase`;
CREATE TABLE `purchase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productid` int(11) NOT NULL,
  `productname` varchar(30) NOT NULL,
  `number` int(11) NOT NULL,
  `producedate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of purchase
-- ----------------------------
INSERT INTO `purchase` VALUES ('1', '1', '脉动', '100', '2017-04-24');
INSERT INTO `purchase` VALUES ('2', '2', '薯条', '40', '2017-05-11');
INSERT INTO `purchase` VALUES ('3', '3', '黑人牙膏', '9', '2017-01-11');
INSERT INTO `purchase` VALUES ('4', '6', '果味糖', '18', '2017-04-19');
INSERT INTO `purchase` VALUES ('5', '8', '辣条', '50', '2017-01-20');
INSERT INTO `purchase` VALUES ('6', '11', '苹果', '2', '2017-06-11');
INSERT INTO `purchase` VALUES ('7', '15', '榴莲', '5', '2017-06-20');

-- ----------------------------
-- Table structure for `sell`
-- ----------------------------
DROP TABLE IF EXISTS `sell`;
CREATE TABLE `sell` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productid` int(11) NOT NULL,
  `productname` varchar(30) NOT NULL,
  `number` int(11) NOT NULL,
  `selldate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sell
-- ----------------------------
INSERT INTO `sell` VALUES ('1', '1', '脉动', '5', '2017-06-24');
INSERT INTO `sell` VALUES ('2', '2', '薯条', '10', '2017-06-23');
INSERT INTO `sell` VALUES ('3', '3', '黑人牙膏', '1', '2017-06-22');
INSERT INTO `sell` VALUES ('4', '6', '果味糖', '2', '2017-06-24');
INSERT INTO `sell` VALUES ('5', '11', '苹果', '10', '2017-06-25');
INSERT INTO `sell` VALUES ('6', '15', '榴莲', '5', '2017-06-25');

-- ----------------------------
-- Table structure for `stock`
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productid` int(11) NOT NULL,
  `productname` varchar(30) NOT NULL,
  `number` int(11) NOT NULL,
  `producedate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stock
-- ----------------------------
INSERT INTO `stock` VALUES ('1', '1', '脉动', '100', '2017-04-24');
INSERT INTO `stock` VALUES ('2', '2', '薯条', '80', '2017-05-11');
INSERT INTO `stock` VALUES ('3', '3', '黑人牙膏', '18', '2017-01-11');
INSERT INTO `stock` VALUES ('4', '6', '果味糖', '36', '2017-04-19');
INSERT INTO `stock` VALUES ('5', '8', '辣条', '100', '2017-01-20');
INSERT INTO `stock` VALUES ('6', '11', '苹果', '4', '2017-06-11');
INSERT INTO `stock` VALUES ('7', '15', '榴莲', '10', '2017-06-20');
DROP TRIGGER IF EXISTS `stockinsert`;
DELIMITER ;;
CREATE TRIGGER `stockinsert` AFTER INSERT ON `purchase` FOR EACH ROW begin
update stock set number = number + new.number where productid = new.productid;
end
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `stockdelete`;
DELIMITER ;;
CREATE TRIGGER `stockdelete` AFTER INSERT ON `sell` FOR EACH ROW begin
update stock set number = number - new.number where productid = new.productid;
end
;;
DELIMITER ;
