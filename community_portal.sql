-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 01, 2019 at 01:22 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `community_portal`
--

-- --------------------------------------------------------

--
-- Table structure for table `job`
--

CREATE TABLE `job` (
  `JobID` int(25) NOT NULL,
  `JobTitle` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `CompanyName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Salary` varchar(25) COLLATE utf8_unicode_ci NOT NULL,
  `JobDescription` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `job`
--

INSERT INTO `job` (`JobID`, `JobTitle`, `CompanyName`, `Salary`, `JobDescription`) VALUES
(1, 'Software Engineer', 'AFX gen Pte Ltd', '$5000', 'Monitor the implementation of new software.'),
(2, 'Sample Job', 'Tester Pte Lte', '$1000', 'Testing the program');

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `person_id` int(11) NOT NULL,
  `firstname` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `lastname` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `company_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `city` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `country` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `type` tinyint(10) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`person_id`, `firstname`, `lastname`, `email`, `password`, `company_name`, `city`, `country`, `type`) VALUES
(1, 'Julienne', 'Gilphillan', 'jgilphillan0@bizjournals.com', 'dnAngR', 'Voonte', 'Tikhvin', 'Russia', 1),
(2, 'Dacey', 'Ruslinge', 'druslinge1@themeforest.net', '4xqyOdXdc', 'Meetz', 'Salt Lake City', 'United States', 1),
(3, 'Lexie', 'Woodard', 'lwoodard2@elpais.com', 'MzdnDCNh', 'Roodel', 'Espírito Santo do Pinhal', 'Brazil', 1),
(4, 'Madelena', 'Stollmeier', 'mstollmeier3@cmu.edu', 'W7klz9', 'Einti', 'Noginsk-9', 'Russia', 1),
(5, 'Matilde', 'Gallaccio', 'mgallaccio4@go.com', 'HDLkZju', 'Topicblab', 'Dizangué', 'Cameroon', 1),
(6, 'Marco', 'Prover', 'mprover5@japanpost.jp', 'kg3kpn', 'Zoozzy', 'Ouango', 'Central African Republic', 1),
(7, 'Phip', 'McLennan', 'pmclennan6@noaa.gov', 'gJiVOZvLB', 'Yakidoo', 'Birr', 'Ireland', 1),
(8, 'Salomo', 'Bleesing', 'sbleesing7@addthis.com', 'N8ye3re185P0', 'Bubbletube', 'Tabuny', 'Russia', 1),
(9, 'Dominique', 'Daubeny', 'ddaubeny8@epa.gov', 'b3kYB4', 'Cogilith', 'Tegalgede', 'Indonesia', 1),
(10, 'Bertrando', 'Monger', 'bmonger9@shutterfly.com', 'RCgA2zzy', 'Trunyx', 'Tarragona', 'Philippines', 1),
(11, 'Gussi', 'Jeffree', 'gjeffreea@diigo.com', 'LmFoTAMZiOM', 'Trudoo', 'Świdnica', 'Poland', 1),
(12, 'Ashely', 'Morbey', 'amorbeyb@nyu.edu', 'N6D2ic2', 'Flashpoint', 'Parung', 'Indonesia', 1),
(13, 'Tad', 'Cumberland', 'tcumberlandc@hubpages.com', 'pI26uGl1t', 'Mydo', 'Viloco', 'Bolivia', 1),
(14, 'Domeniga', 'Phettis', 'dphettisd@reuters.com', 'sEzT9n', 'Edgeclub', 'Ipoh', 'Malaysia', 1),
(15, 'Petr', 'Jotham', 'pjothame@bbb.org', 'SBSbjl', 'Zoonder', 'Klutuk', 'Indonesia', 1),
(16, 'Elvina', 'Mauchlen', 'emauchlenf@shop-pro.jp', 'GSfdi2nmWq', 'Gigabox', 'Almolonga', 'Guatemala', 1),
(17, 'Alex', 'Ruffy', 'aruffyg@arstechnica.com', 'RRokFwT', 'Jayo', 'Lorena', 'Brazil', 1),
(18, 'Joya', 'Manske', 'jmanskeh@1und1.de', 'NkaMtodit', 'Mita', 'Jingchuan', 'China', 1),
(19, 'Kendrick', 'Maguire', 'kmaguirei@phoca.cz', '3VsM6zEs', 'Devpoint', 'Omaha', 'United States', 1),
(20, 'Bobbee', 'Molineux', 'bmolineuxj@nps.gov', 'gtv9ELaIgth', 'Thoughtbridge', 'Fuxin', 'China', 1),
(21, 'Jude', 'Tomashov', 'jtomashovk@networksolutions.com', 'bNH9O3q', 'Babbleset', 'Los Angeles', 'United States', 1),
(22, 'Phylys', 'Pigney', 'ppigneyl@yale.edu', '8s6eqFK', 'Jabbersphere', 'Abraham’s Bay', 'Bahamas', 1),
(23, 'Roley', 'Simonich', 'rsimonichm@skype.com', 'y7Xq3i', 'Tagpad', 'Moss', 'Norway', 1),
(24, 'Aguste', 'Shearstone', 'ashearstonen@thetimes.co.uk', 'PF1CMkK', 'Chatterbridge', 'Charikar', 'Afghanistan', 1),
(25, 'Beatrice', 'Tremouille', 'btremouilleo@drupal.org', 'Y13mUO', 'Meedoo', 'Kuantian', 'China', 1),
(26, 'Saree', 'Ovid', 'sovidp@t.co', 'fcYwS2c9ZUpw', 'Tekfly', 'Chemerivtsi', 'Ukraine', 1),
(27, 'Filide', 'Scase', 'fscaseq@linkedin.com', '1wy9O5Hr', 'Tambee', 'Gubeikou', 'China', 1),
(28, 'Zane', 'Croxton', 'zcroxtonr@aboutads.info', 'OnlgFxe', 'Oloo', 'Uppsala', 'Sweden', 1),
(29, 'Vita', 'Claesens', 'vclaesenss@goo.gl', 'cMLxljXmVgUd', 'Digitube', 'Lang', 'China', 1),
(30, 'Kelwin', 'Harold', 'kharoldt@illinois.edu', 'swoRbtJ', 'Innojam', 'Karang Kulon', 'Indonesia', 1),
(31, 'Brody', 'Cordingly', 'bcordinglyu@europa.eu', 'VBw35hy', 'Tanoodle', 'Brodarica', 'Croatia', 1),
(32, 'Dion', 'Mardall', 'dmardallv@printfriendly.com', 'VCzisR0XAGf', 'Jabbersphere', 'Karatsu', 'Japan', 1),
(33, 'Lottie', 'Lindwall', 'llindwallw@wikia.com', 'H56ohd5nYAD', 'Photofeed', 'Baie-D\'Urfé', 'Canada', 1),
(34, 'Sallie', 'Enterle', 'senterlex@japanpost.jp', '4aZMdevfaYAD', 'Twitterbridge', 'Muara Dua', 'Indonesia', 1),
(35, 'Dorolisa', 'MacNeilley', 'dmacneilleyy@dagondesign.com', 'IIK9rb', 'Devpoint', 'Cashel', 'Ireland', 1),
(36, 'Nye', 'Cowe', 'ncowez@a8.net', 'Hc5bgLAO', 'Tagchat', 'Yuekou', 'China', 1),
(37, 'Devin', 'McWard', 'dmcward10@ucsd.edu', 'wS74x0xY0Wm', 'Camido', 'Orsk', 'Russia', 1),
(38, 'Lark', 'Frizzell', 'lfrizzell11@disqus.com', 'QO9zWJ4CwgTM', 'DabZ', 'Oenpeotnai', 'Indonesia', 1),
(39, 'Inglis', 'Bartlam', 'ibartlam12@java.com', 'wjsxnrty', 'Realcube', 'Velikiy Novgorod', 'Russia', 1),
(40, 'Kean', 'Curteis', 'kcurteis13@vkontakte.ru', '0oEvhpp3FFSi', 'Roombo', 'Tarnogskiy Gorodok', 'Russia', 1),
(41, 'Matty', 'Glamart', 'mglamart14@technorati.com', 'nK1QkU', 'Twitterworks', 'Kaberamaido', 'Uganda', 1),
(42, 'Adrian', 'Gerge', 'agerge15@instagram.com', 'moWbeTQO', 'Edgeify', 'Moquegua', 'Peru', 1),
(43, 'Rustie', 'Standish-Brooks', 'rstandishbrooks16@smh.com.au', 'Ya8dDZ', 'Oyoyo', 'Lewotukan', 'Indonesia', 1),
(44, 'Kellia', 'Gadeaux', 'kgadeaux17@cnbc.com', 'k4NDq7Q78k', 'Geba', 'Mandi Bahāuddīn', 'Pakistan', 1),
(45, 'Mallory', 'Wildin', 'mwildin18@rakuten.co.jp', 'JJZcxb', 'Divanoodle', 'Chat Trakan', 'Thailand', 1),
(46, 'Kerrill', 'Lovick', 'klovick19@devhub.com', 'j4XBPjJ', 'Eare', 'Open Stage', 'Maldives', 1),
(47, 'Marge', 'Do', 'mdo1a@wikispaces.com', '7tW66v', 'Vinte', 'Tangzhuang', 'China', 1),
(48, 'Larry', 'Van Leijs', 'lvanleijs1b@craigslist.org', 'oZhrOPuC', 'Rooxo', 'Cruzeiro do Oeste', 'Brazil', 1),
(51, 'Ximenes', 'Mole', 'xmole0@squidoo.com', '6cydsdu', 'Wordpedia', 'Mojorembun', 'Indonesia', 2),
(52, 'Louisa', 'Worsom', 'lworsom0@digg.com', 'ZoDX4ncksQMp', 'Zoovu', 'Chimbote', 'Peru', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `job`
--
ALTER TABLE `job`
  ADD PRIMARY KEY (`JobID`);

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`person_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `job`
--
ALTER TABLE `job`
  MODIFY `JobID` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `person`
--
ALTER TABLE `person`
  MODIFY `person_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=112;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
