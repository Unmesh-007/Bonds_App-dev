DROP TABLE IF EXISTS Book;
CREATE TABLE Book (
    bookId long PRIMARY KEY,
    BookName VARCHAR(255)
);


DROP TABLE IF EXISTS CounterParty;
CREATE TABLE CounterParty (
    counterPartyId INT PRIMARY KEY,
    counterPartyName VARCHAR(255)
);

DROP TABLE IF EXISTS Security;
CREATE TABLE Security (
    securityId INT PRIMARY KEY,
    securityISIN VARCHAR(20),
    securityCUSIP VARCHAR(20),
    securityIssuer VARCHAR(255),
    securityMaturityDate DATE,
    securityCoupon DECIMAL(5, 2),
    securityType VARCHAR(50),
    securityFaceValue DECIMAL(15, 2),
    securityStatus VARCHAR(50)
);


DROP TABLE IF EXISTS TeamX;
CREATE TABLE TeamX (
    userId INT PRIMARY KEY,
    userName VARCHAR(255),
    userEmail VARCHAR(255),
    userRole VARCHAR(50)
);


DROP TABLE IF EXISTS Trade;
CREATE TABLE Trade (
    tradeId INT PRIMARY KEY,
    tradeBookId INT,
    tradeCounterpartyId INT,
    tradeSecurityId INT,
    tradeQuantity INT,
    tradeStatus VARCHAR(50),
    tradePrice DECIMAL(15, 2),
    tradeBuySell VARCHAR(4),
    tradeDate DATE,
    tradeSettlementDate DATE,
    FOREIGN KEY (tradeBookId) REFERENCES Book(bookId),
    FOREIGN KEY (tradeCounterpartyId) REFERENCES CounterParty(counterPartyId),
    FOREIGN KEY (tradeSecurityId) REFERENCES Security(securityId)
);

DROP TABLE IF EXISTS BookUser;
CREATE TABLE BookUser (
    BookId INT,
    UserId INT,
    FOREIGN KEY (BookId) REFERENCES Book(bookId),
    FOREIGN KEY (UserId) REFERENCES TeamX(userId),
    PRIMARY KEY (BookId, UserId)
);