-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 24 Bulan Mei 2023 pada 17.37
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tiketin`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `home_page`
--

CREATE TABLE `home_page` (
  `id` int(11) NOT NULL,
  `lokasi` varchar(50) NOT NULL,
  `nama_film` varchar(50) NOT NULL,
  `pilih_hari` varchar(50) NOT NULL,
  `pilih_studio` varchar(50) NOT NULL,
  `jam_tayang` varchar(50) NOT NULL,
  `pilih_bangku` varchar(50) NOT NULL,
  `total_harga` varchar(50) NOT NULL,
  `nomor_telepon` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `home_page`
--

INSERT INTO `home_page` (`id`, `lokasi`, `nama_film`, `pilih_hari`, `pilih_studio`, `jam_tayang`, `pilih_bangku`, `total_harga`, `nomor_telepon`) VALUES
(37, 'Bekasi', 'Avengers: Endgame', '26 May 2023', 'MAll bekasi 1', '14:10', 'B4, B5', '90000', '812345677'),
(38, 'Bekasi', 'Avengers: Endgame', '26 May 2023', 'MAll bekasi 1', '14:10', 'C4, C5', '90000', '812345677'),
(39, 'Depok', 'Avengers: Endgame', '25 May 2023', 'MAll depok 1', '14:10', 'B4, B5', '90000', '081380482452'),
(40, 'Bekasi', 'Avengers: Endgame', '26 May 2023', 'MAll bekasi 1', '15:10', 'A5, A6', '90000', '812345678'),
(41, 'Depok', 'Avengers: Endgame', '26 May 2023', 'MAll depok 1', '14:10', 'A5, A6', '90000', '812345678'),
(42, 'Depok', 'KKN di Desa Penari', '26 May 2023', 'MAll depok 1', '15:10', 'B4, B5', '90000', '081380482452');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login_user`
--

CREATE TABLE `login_user` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` int(8) NOT NULL,
  `no_telpon` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `login_user`
--

INSERT INTO `login_user` (`id`, `username`, `password`, `no_telpon`) VALUES
(1, 'kiming', 0, '812345678'),
(2, 'kiming', 12345678, '0812345677'),
(3, 'joshu', 12345678, '081234567'),
(4, 'rizky', 34567890, '081380482452');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `home_page`
--
ALTER TABLE `home_page`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `login_user`
--
ALTER TABLE `login_user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `home_page`
--
ALTER TABLE `home_page`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT untuk tabel `login_user`
--
ALTER TABLE `login_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
