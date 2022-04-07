/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     07-Apr-22 9:29:46 AM                         */
/*==============================================================*/


/*==============================================================*/
/* Table: CHITIETDATXE                                          */
/*==============================================================*/
CREATE TABLE CHITIETDATXE 
(
   MADX                 CHAR(10)                       NOT NULL,
   MALX                 CHAR(10)                       NOT NULL,
   SOLUONG              INTEGER                        NULL,
   NGAYNHANXE           DATE                           NULL,
   NGAYTRAXE            DATE                           NULL
);

ALTER TABLE CHITIETDATXE
   ADD CONSTRAINT PK_CHITIETDATXE PRIMARY KEY CLUSTERED (MADX, MALX);

/*==============================================================*/
/* Table: CHITIETHOADON                                         */
/*==============================================================*/
CREATE TABLE CHITIETHOADON 
(
   SOHOADON             CHAR(10)                       NOT NULL,
   MAXE                 CHAR(10)                       NOT NULL,
   NGAYNHANXE           DATE                           NULL,
   NGAYTRAXE            DATE                           NULL
);

ALTER TABLE CHITIETHOADON
   ADD CONSTRAINT PK_CHITIETHOADON PRIMARY KEY CLUSTERED (SOHOADON, MAXE);

/*==============================================================*/
/* Table: CHITIETHOPDONG                                        */
/*==============================================================*/
CREATE TABLE CHITIETHOPDONG 
(
   SOHOPDONG            CHAR(10)                       NOT NULL,
   MALX                 CHAR(10)                       NOT NULL,
   SOLUONG              INTEGER                        NULL,
   NGAYNHANXE           DATE                           NULL,
   NGAYTRAXE            DATE                           NULL,
   GIA                  FLOAT                          NULL,
   GHICHU               VARCHAR(50)                    NULL
);

ALTER TABLE CHITIETHOPDONG
   ADD CONSTRAINT PK_CHITIETHOPDONG PRIMARY KEY CLUSTERED (SOHOPDONG, MALX);

/*==============================================================*/
/* Table: DONDATXE                                              */
/*==============================================================*/
CREATE TABLE DONDATXE 
(
   MADX                 CHAR(10)                       NOT NULL,
   SOHOPDONG            CHAR(10)                       NULL,
   MAND                 CHAR(10)                       NOT NULL,
   NGAYDATXE            DATE                           NULL,
   TINHTRANG            VARCHAR(20)                    NULL
);

ALTER TABLE DONDATXE
   ADD CONSTRAINT PK_DONDATXE PRIMARY KEY (MADX);

/*==============================================================*/
/* Table: HOADON                                                */
/*==============================================================*/
CREATE TABLE HOADON 
(
   SOHOADON             CHAR(10)                       NOT NULL,
   SOHOPDONG            CHAR(10)                       NOT NULL,
   MANV                 CHAR(10)                       NOT NULL,
   NGAYHOADON           DATE                           NULL,
   TRATRUOC             FLOAT                          NULL,
   TRASAU               FLOAT                          NULL,
   PHIPS                FLOAT                          NULL,
   LYDO                 VARCHAR(50)                    NULL,
   THANHTIEN            FLOAT                          NULL
);

ALTER TABLE HOADON
   ADD CONSTRAINT PK_HOADON PRIMARY KEY (SOHOADON);

/*==============================================================*/
/* Table: HOPDONG                                               */
/*==============================================================*/
CREATE TABLE HOPDONG 
(
   SOHOPDONG            CHAR(10)                       NOT NULL,
   SOHOADON             CHAR(10)                       NULL,
   MADX                 CHAR(10)                       NOT NULL,
   MAKH                 CHAR(10)                       NOT NULL,
   _CO_MAND             CHAR(10)                       NOT NULL,
   NGAYHD               DATE                           NULL,
   ND_CONGVIEC          VARCHAR(50)                    NULL,
   HTTT                 VARCHAR(50)                    NULL,
   TRACHNHIEM           VARCHAR(50)                    NULL,
   DIEUKIEN             VARCHAR(50)                    NULL,
   TRATRUOC             FLOAT                          NULL
);

ALTER TABLE HOPDONG
   ADD CONSTRAINT PK_HOPDONG PRIMARY KEY (SOHOPDONG);

/*==============================================================*/
/* Table: LOAIXE                                                */
/*==============================================================*/
CREATE TABLE LOAIXE 
(
   MALX                 CHAR(10)                       NOT NULL,
   TENLX                VARCHAR(30)                    NULL,
   SOCHO                INTEGER                        NULL,
   SOLUONG              INTEGER                        NULL,
   GIA                  FLOAT                          NULL,
   NGOAIGIO             FLOAT                          NULL
);

ALTER TABLE LOAIXE
   ADD CONSTRAINT PK_LOAIXE PRIMARY KEY (MALX);

/*==============================================================*/
/* Table: NGUOIDUNG                                             */
/*==============================================================*/
CREATE TABLE NGUOIDUNG 
(
   MAND                 CHAR(10)                       NOT NULL,
   TENND                VARCHAR(30)                    NULL,
   TENTK                VARCHAR(30)                    NULL,
   EMAIL                VARCHAR(30)                    NULL,
   MATKHAU              VARCHAR(30)                    NULL,
   ROLE                 VARCHAR(10)                    NULL,
   DIACHI               VARCHAR(50)                    NULL,
   CCCD_T               VARCHAR(50)                    NULL,
   CCCD_S               VARCHAR(50)                    NULL,
   SODT                 VARCHAR(20)                    NULL
);

ALTER TABLE NGUOIDUNG
   ADD CONSTRAINT PK_NGUOIDUNG PRIMARY KEY (MAND);

/*==============================================================*/
/* Table: KHACHHANG                                             */
/*==============================================================*/
CREATE TABLE KHACHHANG 
(
   MAKH                 CHAR(10)                       NOT NULL
);

ALTER TABLE KHACHHANG
   ADD CONSTRAINT PK_KHACHHANG PRIMARY KEY CLUSTERED (MAKH);

/*==============================================================*/
/* Table: NHANVIEN                                              */
/*==============================================================*/
CREATE TABLE NHANVIEN 
(
   MANV                 CHAR(10)                       NOT NULL
);

ALTER TABLE NHANVIEN
   ADD CONSTRAINT PK_NHANVIEN PRIMARY KEY CLUSTERED (MANV);

/*==============================================================*/
/* Index: _CODE_NHANVIEN_PK                                     */
/*==============================================================*/
CREATE UNIQUE CLUSTERED INDEX _CODE_NHANVIEN_PK ON NHANVIEN (
MANV ASC
);

/*==============================================================*/
/* Table: QUANLY                                                */
/*==============================================================*/
CREATE TABLE QUANLY 
(
   MAQL                 CHAR(10)                       NOT NULL
);

ALTER TABLE QUANLY
   ADD CONSTRAINT PK_QUANLY PRIMARY KEY CLUSTERED (MAQL);



/*==============================================================*/
/* Table: XE                                                    */
/*==============================================================*/
CREATE TABLE XE 
(
   MAXE                 CHAR(10)                       NOT NULL,
   MALX                 CHAR(10)                       NOT NULL,
   BIENSO               VARCHAR(20)                    NULL,
   MOTA                 VARCHAR(50)                    NULL,
   TINHTRANG            VARCHAR(20)                    NULL
);

ALTER TABLE XE
   ADD CONSTRAINT PK_XE PRIMARY KEY (MAXE);

/*==============================================================*/
/* Table: XETHUE                                                */
/*==============================================================*/
CREATE TABLE XETHUE 
(
   SOHOPDONG            CHAR(10)                       NOT NULL,
   MAXE                 CHAR(10)                       NOT NULL
);

ALTER TABLE XETHUE
   ADD CONSTRAINT PK_XETHUE PRIMARY KEY CLUSTERED (SOHOPDONG, MAXE);


-------------------------------------------------------------------

ALTER TABLE CHITIETDATXE
   ADD CONSTRAINT FK_CHITIETD_CHITIETDA_DONDATXE FOREIGN KEY (MADX)
      REFERENCES DONDATXE (MADX)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE CHITIETDATXE
   ADD CONSTRAINT FK_CHITIETD_CHITIETDA_LOAIXE FOREIGN KEY (MALX)
      REFERENCES LOAIXE (MALX)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE CHITIETHOADON
   ADD CONSTRAINT FK_CHITIETH_CHITIETHO_HOADON FOREIGN KEY (SOHOADON)
      REFERENCES HOADON (SOHOADON)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE CHITIETHOADON
   ADD CONSTRAINT FK_CHITIETH_CHITIETHO_XE FOREIGN KEY (MAXE)
      REFERENCES XE (MAXE)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE CHITIETHOPDONG
   ADD CONSTRAINT FK_CHITIETH_CHITIETHO_HOPDONG FOREIGN KEY (SOHOPDONG)
      REFERENCES HOPDONG (SOHOPDONG)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE CHITIETHOPDONG
   ADD CONSTRAINT FK_CHITIETH_CHITIETHO_LOAIXE FOREIGN KEY (MALX)
      REFERENCES LOAIXE (MALX)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE DONDATXE
   ADD CONSTRAINT FK_DONDATXE_CUA2_HOPDONG FOREIGN KEY (SOHOPDONG)
      REFERENCES HOPDONG (SOHOPDONG)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE DONDATXE
   ADD CONSTRAINT FK_DONDATXE__AT_KHACHHAN FOREIGN KEY (MAND)
      REFERENCES KHACHHANG (MAKH)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE HOADON
   ADD CONSTRAINT FK_HOADON_BAO_GOM2_HOPDONG FOREIGN KEY (SOHOPDONG)
      REFERENCES HOPDONG (SOHOPDONG)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE HOADON
   ADD CONSTRAINT FK_HOADON_LAP2_NHANVIEN FOREIGN KEY (MANV)
      REFERENCES NHANVIEN (MANV)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE HOPDONG
   ADD CONSTRAINT FK_HOPDONG_BAO_GOM_HOADON FOREIGN KEY (SOHOADON)
      REFERENCES HOADON (SOHOADON)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE HOPDONG
   ADD CONSTRAINT FK_HOPDONG_CO_KHACHHAN FOREIGN KEY (MAKH)
      REFERENCES KHACHHANG (MAKH)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE HOPDONG
   ADD CONSTRAINT FK_HOPDONG_CUA_DONDATXE FOREIGN KEY (MADX)
      REFERENCES DONDATXE (MADX)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE HOPDONG
   ADD CONSTRAINT FK_HOPDONG_LAP_NHANVIEN FOREIGN KEY (_CO_MAND)
      REFERENCES NHANVIEN (MANV)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE KHACHHANG
   ADD CONSTRAINT FK_KHACHHAN_INHERITAN_NGUOIDUN FOREIGN KEY (MAKH)
      REFERENCES NGUOIDUNG (MAND)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE NHANVIEN
   ADD CONSTRAINT FK_NHANVIEN_INHERITAN_NGUOIDUN FOREIGN KEY (MANV)
      REFERENCES NGUOIDUNG (MAND)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE QUANLY
   ADD CONSTRAINT FK_QUANLY_INHERITAN_NGUOIDUN FOREIGN KEY (MAQL)
      REFERENCES NGUOIDUNG (MAND)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE XE
   ADD CONSTRAINT FK_XE_THUOC_LOAIXE FOREIGN KEY (MALX)
      REFERENCES LOAIXE (MALX)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE XETHUE
   ADD CONSTRAINT FK_XETHUE_XETHUE_HOPDONG FOREIGN KEY (SOHOPDONG)
      REFERENCES HOPDONG (SOHOPDONG)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

ALTER TABLE XETHUE
   ADD CONSTRAINT FK_XETHUE_XETHUE2_XE FOREIGN KEY (MAXE)
      REFERENCES XE (MAXE)
      ON UPDATE RESTRICT
      ON DELETE RESTRICT;

----------------------------------------------------------------------
insert into NGUOIDUNG values ('KH001', 'Nguyen Van A', 'nguyenvana', 'nguyenvana@gmail.com', '123','KHACHHANG', 'Ha Noi', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', '0987654321');
insert into NGUOIDUNG values ('KH002', 'Nguyen Van B', 'nguyenvanb', 'nguyenvanb@gmail.com','123','KHACHHANG', 'Ha Noi', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', '0987654321');
insert into NGUOIDUNG values ('KH003', 'Nguyen Van C', 'nguyenvanc', 'nguyenvanc@gmail.com','123','KHACHHANG', 'Ha Noi', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', '0987654321');
insert into NGUOIDUNG values ('NV001', 'Nguyen Van D', 'nguyenvand', 'nguyenvand@gmail.com', '123','NHANVIEN', 'Ha Noi', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', '0987654321');
insert into NGUOIDUNG values ('NV002', 'Nguyen Van E', 'nguyenvane', 'nguyenvane@gmail.com','123','QUANLY', 'Ha Noi', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', '0987654321');
insert into NGUOIDUNG values ('QL001', 'Nguyen Van F', 'nguyenvanf', 'nguyenvanf@gmail.com','123','KHACHHANG', 'Ha Noi', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', '0987654321');
insert into NGUOIDUNG values ('KH004', 'Nguyen Van G', 'nguyenvang', 'nguyenvang@gmail.com', '123','KHACHHANG', 'Ha Noi', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', '0987654321');
insert into NGUOIDUNG values ('KH005', 'Nguyen Van H', 'nguyenvanh', 'nguyenvanh@gmail.com','123','KHACHHANG', 'Ha Noi', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', '0987654321');
insert into NGUOIDUNG values ('KH006', 'Nguyen Van I', 'nguyenvani', 'nguyenvani@gmail.com','123','KHACHHANG', 'Ha Noi', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', '0987654321');

insert into NHANVIEN values ('NV001');
insert into NHANVIEN values ('NV002');

insert into QUANLY values ('QL001');

insert into KHACHHANG values ('KH001');
insert into KHACHHANG values ('KH002');
insert into KHACHHANG values ('KH003');

insert into LOAIXE values ('LX001', 'HONDA', 4, 1, 1000000, 100000);
insert into LOAIXE values ('LX002', 'MERCENDES', 2, 2, 1000000, 100000);
insert into LOAIXE values ('LX003', 'LAMBORGHINI', 2, 3, 1000000, 100000);

insert int  o XE values ('XE001', 'LX001', '99I77060', '', 'DANG THUE');
insert into Xe values ('XE002', 'LX002', '25L31979', '', 'BAO TRI');
insert into XE values ('XE003', 'LX002', '12011980', '', 'DANG THUE');
insert into Xe values ('XE004', 'LX003', '04V12356', '', 'SAN SANG');
insert into Xe values ('XE005', 'LX003', '10E1704', '', 'SAN SANG');
insert into Xe values ('XE006', 'LX003', '43H5452', '', 'SAN SANG');

insert into HOPDONG values ('HDG001', 'null', 'DX001', 'KH001', 'NV001', 2019-01-01 , 'Thue xe honda', 'momo', 'cung cap xe honda', '', 1500);
insert into HOPDONG values ('HDG003', 'null', 'DX003', 'KH003', 'NV002', 2019-01-01 , 'Thue xe mercedes ', 'truc tiep', 'cung cap xe mercedes', '', 2000);

insert into CHITIETHOPDONG values('HDG001', 'LX001', 1, 2019-01-02, 2019-01-03);
insert into CHITIETHOPDONG values('HDG003', 'LX002', 1, 2019-01-02, 2019-01-03);
insert into CHITIETHOPDONG values('HDG003', 'LX003', 1, 2019-01-02, 2019-01-04);


insert into HOADON values('HDN001', 'HDG001', 'NV001', 2019-01-03, 1500, 1500, 0, '', 3000);
insert into HOADON values('HDN002', 'HDG003', 'NV002', 2019-01-05, 2500, 2500, 0, '', 5000);

insert into CHITIETHOADON values('HDN001', 'XE001', 2019-01-02, 2019-01-03);
insert into CHITIETHOADON values('HDN002', 'XE004', 2019-01-02, 2019-01-03);
insert into CHITIETHOADON values('HDN002', 'XE005', 2019-01-02, 2019-01-04);

insert into DONDATXE values('DX001', null, 'KH001', 2019-01-01, 'XAC NHAN');
insert into DONDATXE values('DX002', null, 'KH004', 2019-02-10, 'TU CHOI');
insert into DONDATXE values('DX003', null, 'KH002', 2019-01-02, 'XAC NHAN');

insert into CHITIETDATXE values('DX001', 'LX001', 1, 2019-01-02, 2019-01-03);
insert into CHITIETDATXE values('DX002', 'LX002', 5, 2019-02-11, 2019-02-15);
insert into CHITIETDATXE values('DX003', 'LX002', 1, 2019-01-02, 2019-01-03);
insert into CHITIETDATXE values('DX003', 'LX003', 1, 2019-01-02, 2019-01-04);

























