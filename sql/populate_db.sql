insert into worker (name, birthday, level, salary) values
('Honza', '1987-03-15', 'Junior', 500 ),
('Jan', '1975-11-28', 'Trainee', 1000 ),
('Jarik', '1992-09-05', 'Junior', 700 ),
('Gerda', '1984-06-17', 'Trainee', 1200 ),
('Koko', '1969-12-30', 'Middle', 2500 ),
('Rok', '2001-04-22', 'Senior', 7500 ),
('More', '1995-08-10', 'Senior', 8500 ),
('Jana', '1978-10-03', 'Trainee', 1800 ),
('Katy', '1989-07-19', 'Middle', 2500 ),
('Jon', '1963-02-14', 'Trainee', 1900 );

insert into client (name) values
('Jon'),
('Jarik'),
('Marta'),
('Klara'),
('Omar');


insert into project(CLIENT_ID, START_DATE, FINISH_DATE) values
(1, '2023-01-01', '2023-05-01'),
(2, '2023-02-15', '2024-01-15'),
(3, '2023-03-10', '2024-04-10'),
(4, '2023-04-20', '2023-07-20'),
(5, '2023-05-05', '2023-09-05');

insert into project_worker (PROJECT_ID, WORKER_ID) values
(1, 1),
(1, 2),
(2, 3),
(3, 4),
(3, 5),
(4, 6),
(5, 7),
(5, 8),
(5, 9),
(5, 10);