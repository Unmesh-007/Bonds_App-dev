INSERT INTO Book VALUES
    (1, 'Book A'),
    (2, 'Book B'),
    (3, 'Book C'),
    (4, 'Book D');

INSERT INTO CounterParty VALUES
    (1, 'CounterParty X'),
    (2, 'CounterParty Y'),
    (3, 'CounterParty Z'),
    (4, 'CounterParty W');

INSERT INTO Security VALUES
    (1, 'US1234567890', '12345678', 'Issuer A', '2030-12-31', 5.00, 'Corporate', 1000.00, 'Matured'),
    (2, 'US0987654321', '98765432', 'Issuer B', '2035-06-30', 4.50, 'Government', 500.00, 'Active'),
    (3, 'US5678901234', '56789012', 'Issuer C', '2040-04-15', 3.75, 'Municipal', 750.00, 'Matured'),
    (4, 'US5555555555', '55555555', 'Issuer D', '2025-08-15', 6.25, 'Corporate', 800.00, 'Active');

INSERT INTO TeamX VALUES
    (1, 'User A', 'userA@example.com', 'Analyst'),
    (2, 'User B', 'userB@example.com', 'Analyst'),
    (3, 'User C', 'userC@example.com', 'Analyst'),
    (4, 'User D', 'userD@example.com', 'Analyst'),
    (5, 'User E', 'userE@example.com', 'Analyst');

INSERT INTO Trade VALUES
    (1, 1, 1, 1, 10, 'Complete', 1020.00, 'Buy', '2023-07-15', '2023-07-20'),
    (2, 1, 2, 2, 5, 'Failed', 490.00, 'Sell', '2023-08-05', NULL),
    (3, 1, 1, 3, 7, 'Pending', 760.00, 'Buy', '2023-08-10', NULL),
    (4, 2, 1, 1, 12, 'Complete', 1015.00, 'Sell', '2023-08-01', '2023-08-05'),
    (5, 2, 2, 2, 3, 'Complete', 500.00, 'Buy', '2023-08-02', '2023-08-07'),
    (6, 2, 1, 3, 5, 'Failed', 750.00, 'Sell', '2023-08-12', NULL),
    (7, 1, 1, 2, 2, 'Complete', 480.00, 'Buy', '2023-08-03', '2023-08-08'),
    (8, 2, 1, 2, 8, 'Complete', 505.00, 'Buy', '2023-08-04', '2023-08-09'),
    (9, 1, 2, 3, 4, 'Complete', 760.00, 'Buy', '2023-08-06', '2023-08-11'),
    (10, 2, 1, 1, 3, 'Complete', 1000.00, 'Sell', '2023-08-07', '2023-08-12'),
    (11, 2, 2, 1, 6, 'Failed', 1030.00, 'Buy', '2023-08-08', NULL),
    (12, 1, 3, 2, 9, 'Complete', 485.00, 'Sell', '2023-08-09', '2023-08-14');

INSERT INTO BookUser VALUES
    (1, 1),
    (1, 2),
    (2, 1),
    (2, 3),
    (3, 2),
    (3, 4),
    (4, 1),
    (4, 5);