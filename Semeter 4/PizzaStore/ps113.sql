CREATE DATABASE [PizzaStore]

USE [PizzaStore]
GO
CREATE TABLE [dbo].[Account](
	[AccountID] [nvarchar](50) NOT NULL,
	[UserName] [nvarchar](50) NULL,
	[Password] [nvarchar](50) NULL,
	[FullName] [nvarchar](200) NULL,
	[Type] [int] NULL,
	[CustomerID] [int] NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[AccountID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Categories]    Script Date: 3/11/2024 7:43:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[CategoryID] [int] IDENTITY(1,1) NOT NULL,
	[CategoryName] [nvarchar](100) NULL,
	[Description] [nvarchar](1000) NULL,
 CONSTRAINT [PK_Categories] PRIMARY KEY CLUSTERED 
(
	[CategoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customers](
	[CustomerID] [int] IDENTITY(1,1) NOT NULL,
	[Password] [nvarchar](50) NULL,
	[ContactName] [nvarchar](100) NULL,
	[Address] [nvarchar](200) NULL,
	[Phone] [nvarchar](50) NULL,
 CONSTRAINT [PK_Customers] PRIMARY KEY CLUSTERED 
(
	[CustomerID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetails]    Script Date: 3/11/2024 7:43:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetails](
	[OrderID] [int] NOT NULL,
	[ProductID] [int] NOT NULL,
	[UnitPrice] [float] NULL,
	[Quantity] [int] NULL,
 CONSTRAINT [PK_OrderDetails] PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC,
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders]    Script Date: 3/11/2024 7:43:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[OrderID] [int] IDENTITY(1,1) NOT NULL,
	[CustomerID] [int] NULL,
	[OrderDate] [datetime] NULL,
	[RequiredDate] [datetime] NULL,
	[ShippedDate] [datetime] NULL,
	[Freight] [float] NULL,
	[ShipAddress] [nvarchar](200) NULL,
 CONSTRAINT [PK_Orders] PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Products]    Script Date: 3/11/2024 7:43:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Products](
	[ProductID] [int] IDENTITY(1,1) NOT NULL,
	[ProductName] [nvarchar](200) NULL,
	[SupplierID] [int] NULL,
	[CategoryID] [int] NULL,
	[QuantityPerUnit] [int] NULL,
	[UnitPrice] [float] NULL,
	[ProductImage] [nchar](1000) NULL,
 CONSTRAINT [PK_Products] PRIMARY KEY CLUSTERED 
(
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Suppliers]    Script Date: 3/11/2024 7:43:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Suppliers](
	[SupplierID] [int] IDENTITY(1,1) NOT NULL,
	[CompanyName] [nvarchar](500) NULL,
	[Address] [nvarchar](200) NULL,
	[Phone] [nvarchar](50) NULL,
 CONSTRAINT [PK_Suppliers] PRIMARY KEY CLUSTERED 
(
	[SupplierID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Account] ([AccountID], [UserName], [Password], [FullName], [Type], [CustomerID]) VALUES (N'1', N'account1 ', N'12345', N'Account 1', 1, 1)
INSERT [dbo].[Account] ([AccountID], [UserName], [Password], [FullName], [Type], [CustomerID]) VALUES (N'2', N'user2', N'123', N'User Two', 2, 2)
INSERT [dbo].[Account] ([AccountID], [UserName], [Password], [FullName], [Type], [CustomerID]) VALUES (N'3', N'staff1', N'123', N'Staff One', 1, 3)
INSERT [dbo].[Account] ([AccountID], [UserName], [Password], [FullName], [Type], [CustomerID]) VALUES (N'khoa', N'khoa234', N'123', N'Do Anh Khoaaaa', 2, 4)
INSERT [dbo].[Account] ([AccountID], [UserName], [Password], [FullName], [Type], [CustomerID]) VALUES (N'user', N'user', N'123', N'Nguyen Van A', 2, NULL)
GO
SET IDENTITY_INSERT [dbo].[Categories] ON 

INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Description]) VALUES (1, N'Category 1', N'Description 1')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Description]) VALUES (2, N'Category 2', N'Description 2')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Description]) VALUES (3, N'Category 3', N'Description 3')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Description]) VALUES (4, N'Standard', N'A basic pizza for everyone')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Description]) VALUES (5, N'Specialities', N'A sepcial pizza')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Description]) VALUES (6, N'Pizza', N'Pizza')
SET IDENTITY_INSERT [dbo].[Categories] OFF
GO
SET IDENTITY_INSERT [dbo].[Customers] ON 

INSERT [dbo].[Customers] ([CustomerID], [Password], [ContactName], [Address], [Phone]) VALUES (1, N'123', N'Contact Name 1', N'Address 1', N'Phone 1')
INSERT [dbo].[Customers] ([CustomerID], [Password], [ContactName], [Address], [Phone]) VALUES (2, N'123', N'Contact Name 2', N'Address 2', N'Phone 2')
INSERT [dbo].[Customers] ([CustomerID], [Password], [ContactName], [Address], [Phone]) VALUES (3, N'123', N'Contact Name 3', N'Address 3', N'Phone 3')
INSERT [dbo].[Customers] ([CustomerID], [Password], [ContactName], [Address], [Phone]) VALUES (4, N'123', N'khoa', N'Nguyen Thi Dang', N'0933071004')
INSERT [dbo].[Customers] ([CustomerID], [Password], [ContactName], [Address], [Phone]) VALUES (14, N'12345', N'khoa', N'FPT', N'0909090900')
INSERT [dbo].[Customers] ([CustomerID], [Password], [ContactName], [Address], [Phone]) VALUES (16, N'123', N'cookie', N'342/5 Nguyen Thi Dang Street, District 12, Ho Chi Minh City', N'0912345678')
INSERT [dbo].[Customers] ([CustomerID], [Password], [ContactName], [Address], [Phone]) VALUES (20, N'123', N'New User', N'FPT University', N'09090909')
SET IDENTITY_INSERT [dbo].[Customers] OFF
GO
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [UnitPrice], [Quantity]) VALUES (1, 2, 100, 10)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [UnitPrice], [Quantity]) VALUES (1, 3, 200, 20)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [UnitPrice], [Quantity]) VALUES (2, 2, 300, 30)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [UnitPrice], [Quantity]) VALUES (24, 8, 149, 1)
INSERT [dbo].[OrderDetails] ([OrderID], [ProductID], [UnitPrice], [Quantity]) VALUES (25, 2, 215, 1)
GO
SET IDENTITY_INSERT [dbo].[Orders] ON 

INSERT [dbo].[Orders] ([OrderID], [CustomerID], [OrderDate], [RequiredDate], [ShippedDate], [Freight], [ShipAddress]) VALUES (1, 1, CAST(N'2022-01-01T00:00:00.000' AS DateTime), CAST(N'2022-01-05T00:00:00.000' AS DateTime), CAST(N'2022-01-03T00:00:00.000' AS DateTime), 100, N'Address 1')
INSERT [dbo].[Orders] ([OrderID], [CustomerID], [OrderDate], [RequiredDate], [ShippedDate], [Freight], [ShipAddress]) VALUES (2, 2, CAST(N'2022-02-01T00:00:00.000' AS DateTime), CAST(N'2022-02-05T00:00:00.000' AS DateTime), CAST(N'2022-02-03T00:00:00.000' AS DateTime), 200, N'Address 2')
INSERT [dbo].[Orders] ([OrderID], [CustomerID], [OrderDate], [RequiredDate], [ShippedDate], [Freight], [ShipAddress]) VALUES (3, 3, CAST(N'2022-03-01T00:00:00.000' AS DateTime), CAST(N'2022-03-05T00:00:00.000' AS DateTime), CAST(N'2022-03-03T00:00:00.000' AS DateTime), 300, N'Address 3')
INSERT [dbo].[Orders] ([OrderID], [CustomerID], [OrderDate], [RequiredDate], [ShippedDate], [Freight], [ShipAddress]) VALUES (4, 1, CAST(N'2022-01-01T00:00:00.000' AS DateTime), CAST(N'2022-01-05T00:00:00.000' AS DateTime), CAST(N'2022-01-03T00:00:00.000' AS DateTime), 100, N'Address 1')
INSERT [dbo].[Orders] ([OrderID], [CustomerID], [OrderDate], [RequiredDate], [ShippedDate], [Freight], [ShipAddress]) VALUES (5, 2, CAST(N'2022-02-01T00:00:00.000' AS DateTime), CAST(N'2022-02-05T00:00:00.000' AS DateTime), CAST(N'2022-02-03T00:00:00.000' AS DateTime), 200, N'Address 2')
INSERT [dbo].[Orders] ([OrderID], [CustomerID], [OrderDate], [RequiredDate], [ShippedDate], [Freight], [ShipAddress]) VALUES (6, 3, CAST(N'2022-03-01T00:00:00.000' AS DateTime), CAST(N'2022-03-05T00:00:00.000' AS DateTime), CAST(N'2022-03-03T00:00:00.000' AS DateTime), 300, N'Address 3')
INSERT [dbo].[Orders] ([OrderID], [CustomerID], [OrderDate], [RequiredDate], [ShippedDate], [Freight], [ShipAddress]) VALUES (7, 1, CAST(N'2024-02-25T14:44:13.687' AS DateTime), CAST(N'2022-01-05T00:00:00.000' AS DateTime), CAST(N'2022-01-03T00:00:00.000' AS DateTime), 100, N'Address 1')
INSERT [dbo].[Orders] ([OrderID], [CustomerID], [OrderDate], [RequiredDate], [ShippedDate], [Freight], [ShipAddress]) VALUES (8, 2, CAST(N'2024-02-25T14:44:13.687' AS DateTime), CAST(N'2022-02-05T00:00:00.000' AS DateTime), CAST(N'2022-02-03T00:00:00.000' AS DateTime), 200, N'Address 2')
INSERT [dbo].[Orders] ([OrderID], [CustomerID], [OrderDate], [RequiredDate], [ShippedDate], [Freight], [ShipAddress]) VALUES (9, 3, CAST(N'2024-02-25T14:44:13.687' AS DateTime), CAST(N'2022-03-05T00:00:00.000' AS DateTime), CAST(N'2022-03-03T00:00:00.000' AS DateTime), 300, N'Address 3')
INSERT [dbo].[Orders] ([OrderID], [CustomerID], [OrderDate], [RequiredDate], [ShippedDate], [Freight], [ShipAddress]) VALUES (24, 20, CAST(N'2024-03-10T18:41:52.420' AS DateTime), CAST(N'2024-03-10T18:41:52.420' AS DateTime), CAST(N'2024-03-10T18:41:52.420' AS DateTime), 300, N'FPT University')
INSERT [dbo].[Orders] ([OrderID], [CustomerID], [OrderDate], [RequiredDate], [ShippedDate], [Freight], [ShipAddress]) VALUES (25, 4, CAST(N'2024-03-11T19:41:11.320' AS DateTime), CAST(N'2024-03-11T19:41:11.320' AS DateTime), CAST(N'2024-03-11T19:41:11.320' AS DateTime), 300, N'newyork')
SET IDENTITY_INSERT [dbo].[Orders] OFF
GO
SET IDENTITY_INSERT [dbo].[Products] ON 

INSERT [dbo].[Products] ([ProductID], [ProductName], [SupplierID], [CategoryID], [QuantityPerUnit], [UnitPrice], [ProductImage]) VALUES (2, N'SINGAPORE CHILI CRAB PIZZA', 1, 4, 100, 215, N'https://img.dominos.vn/PIZZA+SINGAPORE+CHILI+CRAB.jpg                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ')
INSERT [dbo].[Products] ([ProductID], [ProductName], [SupplierID], [CategoryID], [QuantityPerUnit], [UnitPrice], [ProductImage]) VALUES (3, N'CHEESY MADNESS', 2, 4, 200, 176, N'https://img.dominos.vn/CHEESY+MADNESS+NO+NEW+PC.jpg                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ')
INSERT [dbo].[Products] ([ProductID], [ProductName], [SupplierID], [CategoryID], [QuantityPerUnit], [UnitPrice], [ProductImage]) VALUES (5, N'NEW YORK CHEESESTEAK', 2, 5, 1000, 215, N'https://img.dominos.vn/Menu+BG+1.jpg                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ')
INSERT [dbo].[Products] ([ProductID], [ProductName], [SupplierID], [CategoryID], [QuantityPerUnit], [UnitPrice], [ProductImage]) VALUES (8, N'Tropical seafood pizza', 1, 6, 20, 149, N'http://thepizzacompany.vn/images/thumbs/000/0002211_tropical-sf_500.png                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ')
SET IDENTITY_INSERT [dbo].[Products] OFF
GO
SET IDENTITY_INSERT [dbo].[Suppliers] ON 

INSERT [dbo].[Suppliers] ([SupplierID], [CompanyName], [Address], [Phone]) VALUES (1, N'Company Name 1', N'Address 1', N'Phone 1')
INSERT [dbo].[Suppliers] ([SupplierID], [CompanyName], [Address], [Phone]) VALUES (2, N'Company Name 2', N'Address 2', N'Phone 2')
INSERT [dbo].[Suppliers] ([SupplierID], [CompanyName], [Address], [Phone]) VALUES (3, N'Company Name 3', N'Address 3', N'Phone 3')
SET IDENTITY_INSERT [dbo].[Suppliers] OFF
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__Customer__5C7E359EF2901C55]    Script Date: 3/11/2024 7:43:41 PM ******/
ALTER TABLE [dbo].[Customers] ADD UNIQUE NONCLUSTERED 
(
	[Phone] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetails_Orders] FOREIGN KEY([OrderID])
REFERENCES [dbo].[Orders] ([OrderID])
GO
ALTER TABLE [dbo].[OrderDetails] CHECK CONSTRAINT [FK_OrderDetails_Orders]
GO
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetails_Products] FOREIGN KEY([ProductID])
REFERENCES [dbo].[Products] ([ProductID])
GO
ALTER TABLE [dbo].[OrderDetails] CHECK CONSTRAINT [FK_OrderDetails_Products]
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK_Orders_Customers] FOREIGN KEY([CustomerID])
REFERENCES [dbo].[Customers] ([CustomerID])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK_Orders_Customers]
GO
ALTER TABLE [dbo].[Products]  WITH CHECK ADD  CONSTRAINT [FK_Products_Categories] FOREIGN KEY([CategoryID])
REFERENCES [dbo].[Categories] ([CategoryID])
GO
ALTER TABLE [dbo].[Products] CHECK CONSTRAINT [FK_Products_Categories]
GO
ALTER TABLE [dbo].[Products]  WITH CHECK ADD  CONSTRAINT [FK_Products_Suppliers] FOREIGN KEY([SupplierID])
REFERENCES [dbo].[Suppliers] ([SupplierID])
GO
ALTER TABLE [dbo].[Products] CHECK CONSTRAINT [FK_Products_Suppliers]
GO
USE [master]
GO
ALTER DATABASE [PizzaStore] SET  READ_WRITE 
GO
