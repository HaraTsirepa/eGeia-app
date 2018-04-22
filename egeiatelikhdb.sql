-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Φιλοξενητής: 127.0.0.1
-- Χρόνος δημιουργίας: 03 Σεπ 2017 στις 17:29:43
-- Έκδοση διακομιστή: 10.1.16-MariaDB
-- Έκδοση PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Βάση δεδομένων: `egeiatelikhdb`
--

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `admins`
--

CREATE TABLE `admins` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Άδειασμα δεδομένων του πίνακα `admins`
--

INSERT INTO `admins` (`id`, `username`, `password`) VALUES
(1, 'nikos', '0ffe1abd1a08215353c233d6e009613e95eec4253832a761af28ff37ac5a150c');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `appointments`
--

CREATE TABLE `appointments` (
  `id` int(11) NOT NULL,
  `doctor_id` int(11) NOT NULL,
  `patient_id` int(11) NOT NULL,
  `appointment_date` varchar(50) NOT NULL,
  `duration` varchar(50) NOT NULL,
  `time` varchar(50) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Άδειασμα δεδομένων του πίνακα `appointments`
--

INSERT INTO `appointments` (`id`, `doctor_id`, `patient_id`, `appointment_date`, `duration`, `time`, `price`) VALUES
(1, 9, 2, 'Tuesday 30/8/2017', '30', '', 10),
(2, 10, 3, 'Friday 1/09/2017', '30', '12-12:30', 10);

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `docavailability`
--

CREATE TABLE `docavailability` (
  `id` int(11) NOT NULL,
  `doctor_id` int(11) NOT NULL,
  `date` varchar(50) NOT NULL,
  `time` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Άδειασμα δεδομένων του πίνακα `docavailability`
--

INSERT INTO `docavailability` (`id`, `doctor_id`, `date`, `time`) VALUES
(1, 9, 'Tuesday 30/8/2017', '13:00-16:00'),
(2, 9, 'Friday 1/09/2017', '10:00-18:00'),
(3, 10, 'Friday 1/09/2017', '12:00-16:00'),
(4, 10, 'Friday 1/09/2017', '20:00-24:00'),
(5, 9, 'Friday 8/9/2017', '11:30-18:00'),
(6, 9, 'Friday 6/10/2017', '11:30-18:00');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `doctors`
--

CREATE TABLE `doctors` (
  `id` int(11) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `speciality` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Άδειασμα δεδομένων του πίνακα `doctors`
--

INSERT INTO `doctors` (`id`, `firstname`, `lastname`, `username`, `password`, `email`, `gender`, `speciality`) VALUES
(9, 'Alexis', 'Koukoulas', 'alexK', '1212', 'alexk@gmail.com', 'Male', 'pathologist');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `patients`
--

CREATE TABLE `patients` (
  `id` int(11) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `amka` varchar(50) NOT NULL,
  `age` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Άδειασμα δεδομένων του πίνακα `patients`
--

INSERT INTO `patients` (`id`, `firstname`, `lastname`, `username`, `password`, `email`, `gender`, `amka`, `age`) VALUES
(2, 'urw', 'sfouggari', 'urw', '111', 'urw@gmail.com', 'Female', '85', 23),
(3, 'Alex', 'Petropoulou', 'ap', 'ap', 'alexk@gmail.com', 'Male', 'aepi', 33),
(4, 'fd', 'fd', 'fd', 'fdf', 'alexk@gmail.com', 'Female', 'sad', 33);

--
-- Ευρετήρια για άχρηστους πίνακες
--

--
-- Ευρετήρια για πίνακα `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`id`);

--
-- Ευρετήρια για πίνακα `docavailability`
--
ALTER TABLE `docavailability`
  ADD PRIMARY KEY (`id`);

--
-- Ευρετήρια για πίνακα `doctors`
--
ALTER TABLE `doctors`
  ADD PRIMARY KEY (`id`);

--
-- Ευρετήρια για πίνακα `patients`
--
ALTER TABLE `patients`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT για άχρηστους πίνακες
--

--
-- AUTO_INCREMENT για πίνακα `admins`
--
ALTER TABLE `admins`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT για πίνακα `docavailability`
--
ALTER TABLE `docavailability`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT για πίνακα `doctors`
--
ALTER TABLE `doctors`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT για πίνακα `patients`
--
ALTER TABLE `patients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
