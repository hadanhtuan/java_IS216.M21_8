g    /*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     08-May-22 8:17:49 PM                         */
/*==============================================================*/


/*==============================================================*/
/* Table: CHITIETDATXE                                          */
/*==============================================================*/
create table CHITIETDATXE 
(
   MADX                 varchar(10)                       not null,
   MALX                 varchar(10)                       not null,
   SOLUONG              integer                        null,
   constraint PK_CHITIETDATXE primary key (MADX, MALX)
);

/*==============================================================*/
/* Table: CHITIETHOADON                                         */
/*==============================================================*/
create table CHITIETHOADON 
(
   SOHOADON             varchar(10)                       not null,
   MAXE                 varchar(10)                       not null,
   constraint PK_CHITIETHOADON primary key (SOHOADON, MAXE)
);

/*==============================================================*/
/* Table: CHITIETHOPDONG                                        */
/*==============================================================*/
create table CHITIETHOPDONG 
(
   SOHOPDONG            varchar(10)                       not null,
   MALX                 varchar(10)                       not null,
   SOLUONG              integer                        null,
   GIA                  float                          null,
   GHICHU               varchar(50)                    null,
   constraint PK_CHITIETHOPDONG primary key (SOHOPDONG, MALX)
);

/*==============================================================*/
/* Table: DONDATXE                                              */
/*==============================================================*/
create table DONDATXE 
(
   MADX                 varchar(10)                       not null,
   MAKH                 varchar(10)                       not null,
   NGAYDATXE            date                           null,
   TINHTRANG            varchar(20)                    null,
   NGAYNHANXE           date                           null,
   NGAYTRAXE            date                           null,
   constraint PK_DONDATXE primary key (MADX)
);
create SEQUENCE DONDATXE_SEQ
    INCREMENT BY 1
    START WITH 13
    MINVALUE 1
    MAXVALUE 1000000
    NOCYCLE;    
/*==============================================================*/
/* Table: HOADON                                                */
/*==============================================================*/
create table HOADON 
(
   SOHOADON             varchar(10)                       not null,
   SOHOPDONG            varchar(10)                       not null,
   MANV                 varchar(10)                       not null,
   NGAYHOADON           date                           null,
   TRATRUOC             float                          null,
   TRASAU               float                          null,
   PHIPS                float                          null,
   LYDO                 varchar(50)                    null,
   TRIGIA               float                          null,
   NGAYNHANXE           date                           null,
   NGAYTRAXE            date                           null,
   constraint PK_HOADON primary key (SOHOADON)
);
create SEQUENCE HOADON_SEQ
    INCREMENT BY 10
    START WITH 500
    MINVALUE 1
    MAXVALUE 10000000
    NOCYCLE;  
/*==============================================================*/
/* Table: HOPDONG                                               */
/*==============================================================*/
create table HOPDONG 
(
   SOHOPDONG            varchar(10)                       not null,
   MADX                 varchar(10)                       not null,
   MAKH                 varchar(10)                       not null,
   MANV                 varchar(10)                       not null,
   NGAYHD               date                           null,
   ND_CONGVIEC          varchar(50)                    null,
   HTTT                 varchar(50)                    null,
   DIEUKIEN             varchar(50)                    null,
   TRATRUOC             float                          null,
   NGAYNHANXE           date                           null,
   NGAYTRAXE            date                           null,
   constraint PK_HOPDONG primary key (SOHOPDONG)
);
create SEQUENCE HOPDONG_SEQ
    INCREMENT BY 1
    START WITH 302
    MINVALUE 1
    MAXVALUE 1000000
    NOCYCLE;    
/*==============================================================*/
/* Table: KHACHHANG                                             */
/*==============================================================*/
create table KHACHHANG 
(
   MAKH                 varchar(10)                       not null,
   DANHDAU              INTEGER                           null,
   TINHTRANG            varchar(30)                       null,
   constraint PK_KHACHHANG primary key (MAKH)
);
/*==============================================================*/
/* Table: LOAIXE                                                */
/*==============================================================*/
create table LOAIXE 
(
   MALX                 varchar(10)                       not null,
   TENLX                varchar(30)                    null,
   SOCHO                integer                        null,
   SOLUONG              integer                        null,
   GIA                  float                          null,
   NGOAIGIO             float                          null,
   ANHNOITHAT           blob                           null,
   ANHBENNGOAI          blob                           null,
   DOANHTHU             float                          null,
   constraint PK_LOAIXE primary key (MALX)
);
create SEQUENCE LOAIXE_SEQ
    INCREMENT BY 1
    START WITH 80
    MINVALUE 1
    MAXVALUE 1000000
    NOCYCLE;    
/*==============================================================*/
/* Table: NGUOIDUNG                                             */
/*==============================================================*/
create table NGUOIDUNG 
(
   MAND                 varchar(10)                       not null,
   TENND                varchar(30)                    null,
   TENTK                varchar(30)                    unique,
   EMAIL                varchar(30)                    null,
   MATKHAU              varchar(30)                    null,
   ROLE                 varchar(10)                    null,
   DIACHI               varchar(100)                   null,
   CCCD_T               blob                           null,
   CCCD_S               blob                           null,
   SODT                 varchar(20)                    null,
   NGAYSINH             date                           null,
   constraint PK_NGUOIDUNG primary key (MAND)
);
create SEQUENCE NGUOIDUNG_SEQ
    INCREMENT BY 1
    START WITH 10
    MINVALUE 1
    MAXVALUE 1000000
    NOCYCLE;    
/*==============================================================*/
/* Table: NHANVIEN                                              */
/*==============================================================*/
create table NHANVIEN 
(
   MANV                 varchar(10)                       not null,
   TINHTRANGLAMVIEC     varchar(20)                    null,
   constraint PK_NHANVIEN primary key (MANV)
);

/*==============================================================*/
/* Table: QUANLY                                                */
/*==============================================================*/
create table QUANLY 
(
   MAQL                 varchar(10)                       not null,
   constraint PK_QUANLY primary key (MAQL)
);

/*==============================================================*/
/* Table: XE                                                    */
/*==============================================================*/
create table XE 
(
   MAXE                 varchar(10)                       not null,
   MALX                 varchar(10)                       not null,
   BIENSO               varchar(20)                    null,
   MOTA                 varchar(50)                    null,
   TINHTRANG            varchar(20)                    null,
   constraint PK_XE primary key (MAXE)
);
create SEQUENCE XE_SEQ
    INCREMENT BY 1
    START WITH 50
    MINVALUE 1
    MAXVALUE 1000000
    NOCYCLE;    
/*==============================================================*/
/* Table: XETHUE                                                */
/*==============================================================*/
create table XETHUE 
(
   MADX                 varchar(10)                       not null,
   MAXE                 varchar(10)                       not null,
   constraint PK_XETHUE primary key (MADX, MAXE)
);


--foreign KEY
alter table CHITIETDATXE
   add constraint FK_CHITIETD_CHITIETDA_DONDATXE foreign key (MADX)
      references DONDATXE (MADX);

alter table CHITIETDATXE
   add constraint FK_CHITIETD_CHITIETDA_LOAIXE foreign key (MALX)
      references LOAIXE (MALX);

alter table CHITIETHOADON
   add constraint FK_CHITIETH_CHITIETHO_HOADON foreign key (SOHOADON)
      references HOADON (SOHOADON);

alter table CHITIETHOADON
   add constraint FK_CHITIETH_CHITIETHO_XE foreign key (MAXE)
      references XE (MAXE);

alter table CHITIETHOPDONG
   add constraint FK_CHITIETH_CHITIETHO_HOPDONG foreign key (SOHOPDONG)
      references HOPDONG (SOHOPDONG);

alter table CHITIETHOPDONG
   add constraint FK_CHITIETH_CHITIETHO_LOAIXE foreign key (MALX)
      references LOAIXE (MALX);

alter table DONDATXE
   add constraint FK_DONDATXE__AT_KHACHHAN foreign key (MAKH)
      references KHACHHANG (MAKH);

alter table HOADON
   add constraint FK_HOADON_BAO_GOM2_HOPDONG foreign key (SOHOPDONG)
      references HOPDONG (SOHOPDONG);

alter table HOADON
   add constraint FK_HOADON_LAP2_NHANVIEN foreign key (MANV)
      references NHANVIEN (MANV);

alter table HOPDONG
   add constraint FK_HOPDONG_CO_KHACHHAN foreign key (MAKH)
      references KHACHHANG (MAKH);

alter table HOPDONG
   add constraint FK_HOPDONG_CUA_DONDATXE foreign key (MADX)
      references DONDATXE (MADX);

alter table HOPDONG
   add constraint FK_HOPDONG_LAP_NHANVIEN foreign key (MANV)
      references NHANVIEN (MANV);

alter table KHACHHANG
   add constraint FK_KHACHHAN_INHERITAN_NGUOIDUN foreign key (MAKH)
      references NGUOIDUNG (MAND);

alter table NHANVIEN
   add constraint FK_NHANVIEN_INHERITAN_NGUOIDUN foreign key (MANV)
      references NGUOIDUNG (MAND);

alter table QUANLY
   add constraint FK_QUANLY_INHERITAN_NGUOIDUN foreign key (MAQL)
      references NGUOIDUNG (MAND);

alter table XE
   add constraint FK_XE_THUOC_LOAIXE foreign key (MALX)
      references LOAIXE (MALX);

alter table XETHUE
   add constraint FK_XETHUE_XETHUE_DONDATXE foreign key (MADX)
      references DONDATXE (MADX);

alter table XETHUE
   add constraint FK_XETHUE_XETHUE2_XE foreign key (MAXE)
      references XE (MAXE);

--INSERT
insert into NGUOIDUNG values ('ND'||TO_CHAR(NGUOIDUNG_SEQ.NEXTVAL), 'Nguyen Van A', 'nguyenvana', 'nguyenvana@gmail.com', '123','NHANVIEN', 'Ha Noi', null, null, '0987654321', '');
insert into NGUOIDUNG values ('ND'||TO_CHAR(NGUOIDUNG_SEQ.NEXTVAL), 'Nguyen Van B', 'nguyenvanb', 'nguyenvanb@gmail.com', '123','QUANLY', 'Ha Noi', null, null, '0987654321', '');
insert into NGUOIDUNG values ('ND'||TO_CHAR(NGUOIDUNG_SEQ.NEXTVAL), 'Nguyen Van C', 'nguyenvanc', 'nguyenvanc@gmail.com', '123','KHACHHANG', 'Ha Noi', null, null, '0987654321', '');
insert into NGUOIDUNG values ('ND'||TO_CHAR(NGUOIDUNG_SEQ.NEXTVAL), 'Nguyen Van D', 'nguyenvand', 'nguyenvand@gmail.com', '123','KHACHHANG', 'Ha Noi', null, null, '0987654321', '');
insert into NGUOIDUNG values ('ND'||TO_CHAR(NGUOIDUNG_SEQ.NEXTVAL), 'Nguyen Van E', 'nguyenvane', 'nguyenvane@gmail.com', '123','KHACHHANG', 'Ha Noi', null, null, '0987654321', '');

insert into NHANVIEN values ('ND10', 'DANG LAM');

insert into QUANLY values ('ND11');

insert into KHACHHANG values ('ND12', 0, null);
insert into KHACHHANG values ('ND13', 0, null);
insert into KHACHHANG values ('ND14', 0, null);


insert into LOAIXE values ('LX'||LOAIXE_SEQ.NEXTVAL, 'HONDA', 4, 1, 1000000, 100000, null, null, null);
insert into LOAIXE values ('LX'||LOAIXE_SEQ.NEXTVAL, 'MERCENDES', 2, 2, 1000000, 100000, null, null, null);
insert into LOAIXE values ('LX'||LOAIXE_SEQ.NEXTVAL, 'LAMBORGHINI', 2, 3, 1000000, 100000, null, null, null);

insert into XE values ('XE'||XE_SEQ.NEXTVAL, 'LX80', '99I77060', '', 'SAN SANG');
insert into Xe values ('XE'||XE_SEQ.NEXTVAL, 'LX81', '25L31979', '', 'SAN SANG');
insert into XE values ('XE'||XE_SEQ.NEXTVAL, 'LX81', '12011980', '', 'SAN SANG');
insert into Xe values ('XE'||XE_SEQ.NEXTVAL, 'LX82', '04V12356', '', 'SAN SANG');
insert into Xe values ('XE'||XE_SEQ.NEXTVAL, 'LX82', '10E1704', '', 'SAN SANG');
insert into Xe values ('XE'||XE_SEQ.NEXTVAL, 'LX82', '43H5452', '', 'SAN SANG');

insert into DONDATXE values('DX'|| TO_CHAR(DONDATXE_SEQ.NEXTVAL), 'ND12', TO_DATE('22/8/2011','DD/MM/YYYY'), 'XAC NHAN', TO_DATE('22/8/2011','DD/MM/YYYY'), TO_DATE('22/8/2011','DD/MM/YYYY'));
insert into DONDATXE values('DX'|| TO_CHAR(DONDATXE_SEQ.NEXTVAL), 'ND12', TO_DATE('12/10/2002','DD/MM/YYYY'), 'TU CHOI', TO_DATE('13/10/2002','DD/MM/YYYY'), TO_DATE('14/10/2011','DD/MM/YYYY'));
insert into DONDATXE values('DX'|| TO_CHAR(DONDATXE_SEQ.NEXTVAL), 'ND13', TO_DATE('17/04/2011','DD/MM/YYYY'), 'XAC NHAN', TO_DATE('18/04/2011','DD/MM/YYYY'), TO_DATE('20/04/2011','DD/MM/YYYY'));

insert into CHITIETDATXE values('DX13', 'LX80', 1);
insert into CHITIETDATXE values('DX14', 'LX80', 5);
insert into CHITIETDATXE values('DX15', 'LX81', 2);
insert into CHITIETDATXE values('DX15', 'LX82', 1);


insert into HOPDONG values ('HDG'||HOPDONG_SEQ.NEXTVAL, 'DX13', 'ND12', 'ND10', TO_DATE('01/01/2019','DD/MM/YYYY') , 'Thue xe honda', 'momo', 'cung cap xe honda',
1500, TO_DATE('02/01/2019','DD/MM/YYYY'), TO_DATE('03/01/2019','DD/MM/YYYY'));
insert into HOPDONG values ('HDG'||HOPDONG_SEQ.NEXTVAL, 'DX15', 'ND13', 'ND10', TO_DATE('01/01/2019','DD/MM/YYYY') , 'Thue xe mercedes ', 'truc tiep', 'cung cap xe mercedes',
2000, TO_DATE('02/01/2019','DD/MM/YYYY'), TO_DATE('04/01/2019','DD/MM/YYYY'));

insert into CHITIETHOPDONG values('HDG302', 'LX80', 1, 1000000, '');
insert into CHITIETHOPDONG values('HDG303', 'LX81', 2, 2000000, '');
insert into CHITIETHOPDONG values('HDG303', 'LX82', 1, 1000000, '');


insert into HOADON values('HDN'||HOADON_SEQ.NEXTVAL, 'HDG302', 'ND10', TO_DATE('03/01/2019','DD/MM/YYYY'), 
500000, 500000, 0, '', 1000000, TO_DATE('22/10/2011','DD/MM/YYYY'), TO_DATE('22/10/2011','DD/MM/YYYY'));

insert into HOADON values('HDN'||HOADON_SEQ.NEXTVAL, 'HDG303', 'ND10', TO_DATE('05/01/2019','DD/MM/YYYY'), 
500000, 500000, 0, '', 1000000, TO_DATE('02/01/2019','DD/MM/YYYY'), TO_DATE('04/01/2019','DD/MM/YYYY'));

insert into CHITIETHOADON values('HDN500', 'XE50');
insert into CHITIETHOADON values('HDN510', 'XE51');
insert into CHITIETHOADON values('HDN510', 'XE52');
insert into CHITIETHOADON values('HDN510', 'XE53');



INSERT INTO XETHUE VALUES('DX15', 'XE50');
INSERT INTO XETHUE VALUES('DX15', 'XE51');
INSERT INTO XETHUE VALUES('DX15', 'XE52');


--TRIGGERS

--Số lượng xe phải bằng tổng số xe
CREATE OR REPLACE TRIGGER THEM_XE
BEFORE INSERT ON XE
FOR EACH ROW
BEGIN
    UPDATE LOAIXE
    SET SOLUONG = SOLUONG+1
    WHERE MALX = :NEW.MALX;
END;

--Ngày trả xe phải lớn hơn ngày nhận xe
CREATE OR REPLACE TRIGGER SETNGAY
BEFORE INSERT ON DONDATXE
FOR EACH ROW
DECLARE 
    V_NGAYNHAN DATE;
    V_NGAYTRA DATE;
BEGIN
    V_NGAYNHAN := :NEW.NGAYNHANXE;
    V_NGAYTRA := :NEW.NGAYTRAXE;

    IF(V_NGAYNHAN > v_NGAYTRA) THEN 
        raise_application_error(-20000, 'Ngày trả xe phải lớn hơn ngày nhận xe');
    END IF;
    
    EXCEPTION WHEN no_data_found
    THEN
        dbms_output.put_line('Khong co du lieu');
END;

create or replace TRIGGER SETNGAY_hoadon
BEFORE INSERT ON hoadon
FOR EACH ROW
DECLARE 
    V_NGAYNHAN DATE;
    V_NGAYTRA DATE;
    v_CURDATE DATE;

BEGIN
    V_NGAYNHAN := :NEW.NGAYNHANXE;
    V_NGAYTRA := :NEW.NGAYTRAXE;

    IF(V_NGAYNHAN > v_NGAYTRA) THEN 
        raise_application_error(-20000, 'Ngày trả xe phải lớn hơn ngày nhận xe');
    END IF;

    SELECT CURRENT_DATE INTO V_CURDATE
    FROM DUAL;

    IF(CURRENT_DATE > V_NGAYNHAN)THEN 
        raise_application_error(-20000, 'Ngày trả xe phải lớn hơn so với ngày hiện tại');
    END IF;

    EXCEPTION WHEN no_data_found
    THEN
        dbms_output.put_line('Khong co du lieu');
END;

--khách hàng có blacklist lớn hơn 3 thì không được thuê xe
CREATE OR REPLACE TRIGGER KIEMTRA_BLACLLIST 
BEFORE INSERT ON DONDATXE
FOR EACH ROW
DECLARE 
    V_DANHDAU INTEGER;
BEGIN
    SELECT DANHDAU INTO V_DANHDAU
    FROM KHACHHANG
    WHERE MAKH = :NEW.MAKH;
    
    IF(V_DANHDAU >= 3)
    THEN
        RAISE_APPLICATION_ERROR(-20000, 'KHACH HANG KHONG DUOC DAT XE');
    END IF;
END;

--cập nhật trả trước cho hợp đồng
CREATE OR REPLACE TRIGGER THEM_TRATUOC
BEFORE INSERT ON HOPDONG 
FOR EACH ROW 
DECLARE 
    V_TT FLOAT;
     V_NGAYNHAN DATE;
    V_NGAYTRA DATE;
BEGIN
    V_NGAYNHAN := :NEW.NGAYNHANXE;
    V_NGAYTRA := :NEW.NGAYTRAXE;
    
    IF(V_NGAYNHAN > v_NGAYTRA) THEN 
        raise_application_error(-20000, 'Ngày trả xe phải lớn hơn ngày nhận xe');
    END IF;
    
    SELECT SUM(CT.SOLUONG * LX.GIA)*(V_NGAYTRA - V_NGAYNHAN) INTO V_TT
    FROM DONDATXE DD JOIN CHITIETDATXE CT ON DD.MADX = CT.MADX JOIN LOAIXE LX ON CT.MALX = LX.MALX
    WHERE DD.MADX = :NEW.MADX;
    
    :NEW.TRATRUOC := V_TT/2;
    
END;

--
CREATE OR REPLACE TRIGGER TU_CHOI_THUE_XE 
BEFORE UPDATE ON DONDATXE
FOR EACH ROW 
BEGIN
    IF(:NEW.TINHTRANG = 'TU CHOI') THEN
        FOR I IN ( SELECT MAXE FROM XETHUE WHERE MADX = :NEW.MADX )
        LOOP
                UPDATE XE 
                SET TINHTRANG = 'SAN SANG'
                WHERE MAXE = I.MAXE;
        END LOOP;
    END IF;
END;


--
CREATE OR REPLACE TRIGGER KIEMTRA_HOADON 
BEFORE INSERT ON HOADON
FOR EACH ROW 
DECLARE
    V_COUNT NUMBER;
BEGIN
    SELECT COUNT(*) INTO V_COUNT FROM HOADON WHERE SOHOPDONG = :NEW.SOHOPDONG;
    
    IF(V_COUNT >= 1) THEN 
        raise_application_error(-20000, 'Hop dong da duoc lap hoa don');
    END IF;
END;

----------------------RÀNG BUỘC MIỀN GIÁ TRỊ:------------------------------------------------------------------
--giá trị của XE.TINHTRANG = {'MO', 'KHOA', 'DANGTHUE', 'DANGSUA'}
ALTER TABLE XE ADD CONSTRAINT XE_CHK_TINHTRANG CHECK( TINHTRANG IN ('SAN SANG', 'KHOA', 'DANG THUE', 'BAO TRI'));

ALTER TABLE NHANVIEN ADD CONSTRAINT NV_CHK_TINHTRANGLAMVIEC CHECK( TINHTRANGLAMVIEC IN ('DANG LAM', 'DA NGHI'));
ALTER TABLE DONDATXE ADD CONSTRAINT DDX_CHK_TINHTRANG CHECK( TINHTRANG IN ('CHUA XAC NHAN', 'XAC NHAN', 'TU CHOI'));

ALTER TABLE NGUOIDUNG ADD CONSTRAINT ND_CHK_ROLE CHECK( ROLE IN ('KHACHHANG', 'NHANVIEN', 'QUANLY'));
ALTER TABLE KHACHHANG ADD CONSTRAINT KH_CHK_TINHTRANG CHECK( TINHTRANG IN ('KICH HOAT', 'CHUA KICH HOAT'));

--proceduce: xethue, insert hopdong, insert hoadon

--------------------------------------PROCEDURE 1: TAO Hop Dong (sử dụng khi nhân viên thay đổi trạng thái đơn đặt xe thành "XAC NHAN")-------------------------------------------------------------
CREATE OR REPLACE PROCEDURE TAOHOPDONG(V_MADX IN varchar, V_MANV IN varchar)
IS
    V_TRATRUOC FLOAT;
    V_MAKH varchar(10);
    V_NNX DATE;
    V_NTX DATE;
    v_CURDATE DATE;
    V_MALX varchar(10);
    V_SL INTEGER;
    V_GIA FLOAT;
    V_MAHOPDONG varchar(10);
    CURSOR CTHOPDONG 
    IS
        SELECT MALX, SOLUONG FROM CHITIETDATXE WHERE MADX = V_MADX;
    
BEGIN
    SELECT D.MAKH, D.NGAYNHANXE, D.NGAYTRAXE INTO V_MAKH, V_NNX, V_NTX FROM DONDATXE D WHERE D.MADX = V_MADX;
    
    SELECT CURRENT_DATE INTO V_CURDATE
    FROM DUAL;
    
    V_MAHOPDONG := 'HDG'|| TO_CHAR(HOPDONG_SEQ.NEXTVAL);
    INSERT INTO HOPDONG(SOHOPDONG, MADX, MAKH, MANV, NGAYHD, NGAYNHANXE, NGAYTRAXE)
    VALUES(V_MAHOPDONG, V_MADX, V_MAKH, V_MANV, V_CURDATE, V_NNX, V_NTX);

    OPEN CTHOPDONG;
    LOOP
        FETCH CTHOPDONG INTO V_MALX, V_SL;  
        EXIT WHEN CTHOPDONG%notfound;
    
        SELECT GIA INTO V_GIA FROM LOAIXE WHERE MALX = V_MALX;
        
        insert into CHITIETHOPDONG values(V_MAHOPDONG, V_MALX, V_SL, V_GIA*V_SL, '');
    
    END LOOP;
    CLOSE CTHOPDONG;
    
END;


-------------------------------------------------------------------------------------------------------------------------------------------





-------------------------------------------------------------------------------------------------------------------------------------------

--------------------------------------PROCEDURE 3: XOA NHAN VIEN---------------------------------------------------------------------------
CREATE OR REPLACE PROCEDURE XOANHANVIEN (V_MANV IN varchar)
IS
BEGIN
    UPDATE NHANVIEN
    SET TINHTRANGLAMVIEC = 'DA NGHI'
    WHERE MANV = V_MANV;
END;   



--------------------------------------PROCEDURE 4: THUE XE----------------------------------------------------------------------------------
CREATE OR REPLACE PROCEDURE THUEXE (V_MAKH IN varchar, V_NNX IN VARCHAR, V_NTX IN VARCHAR, V_DS_LX IN varchar, V_DS_SL IN varchar)
IS
    V_MADX varchar(10);
    V_MAXE varchar(10);
    V_NGAYHIENTAI DATE;
    TYPE ARRAY_T is table of varchar(10);
    TYPE ARRAY_F is table of float;
    ARR_MALX ARRAY_T := ARRAY_T();
    ARR_SL ARRAY_T := ARRAY_T();
    ARR_DOANHTHU ARRAY_F := ARRAY_F();
    ARR_GIA ARRAY_F := ARRAY_F();
    INDEX1 INTEGER;
    INDEX2 INTEGER;
    V_DOANHTHU FLOAT;
    V_GIA FLOAT;
BEGIN
    --lấy ngày hiện tại
    SELECT CURRENT_DATE INTO V_NGAYHIENTAI
    FROM DUAL;
    
    V_MADX := 'DX'|| TO_CHAR(DONDATXE_SEQ.NEXTVAL);
    
    --insert vô dondatxe
    insert into DONDATXE values(V_MADX, V_MAKH, V_NGAYHIENTAI, 'CHUA XAC NHAN', TO_DATE(V_NNX, 'DD/MM/YYYY'), TO_DATE(V_NTX, 'DD/MM/YYYY'));
    
    --chuyển chuỗi V_DS_LX thành mảng
    INDEX1 := 1;
    FOR V_MALX IN (      SELECT REGEXP_SUBSTR (V_DS_LX, '[^,]+', 1, LEVEL)
                        TXT
                        FROM DUAL
                        CONNECT BY REGEXP_SUBSTR (V_DS_LX, '[^,]+', 1, LEVEL)
    IS NOT NULL)
    LOOP
        ARR_MALX.extend(); 
        ARR_MALX(INDEX1) := V_MALX.TXT;
        INDEX1 := INDEX1+1;
    END LOOP;
    
    --chuyển chuỗi V_DS_SL thành mảng
    INDEX2 := 1;
    FOR V_SL IN (      SELECT REGEXP_SUBSTR (V_DS_SL, '[^,]+', 1, LEVEL)
                        TXT
                        FROM DUAL
                        CONNECT BY REGEXP_SUBSTR (V_DS_SL, '[^,]+', 1, LEVEL)
    IS NOT NULL)
    LOOP
        ARR_SL.extend();
        ARR_SL(INDEX2) := V_SL.TXT;
        INDEX2 := INDEX2+1;
    END LOOP;
    
    --lấy giá và doanh thu của từng loại xe
    --LOCK TABLE LOAIXE IN SHARE MODE;
    FOR I IN 1..ARR_MALX.COUNT LOOP
            SELECT DOANHTHU, GIA INTO V_DOANHTHU, V_GIA FROM LOAIXE WHERE MALX = ARR_MALX(I);   
            
            ARR_DOANHTHU.extend();
            ARR_GIA.extend();
            ARR_DOANHTHU(I):= V_DOANHTHU;
            ARR_GIA(I) :=  V_GIA;
                    dbms_output.put_line('doanh thu + gia: ' || V_DOANHTHU || ' ' || V_GIA);
                    dbms_output.put_line('so luong: ' || TO_NUMBER(ARR_SL(I)));

    END LOOP;
    --update doanh thu theo từng loại xe
    FOR I IN 1..ARR_MALX.COUNT LOOP
        UPDATE LOAIXE
        SET DOANHTHU = ARR_DOANHTHU(I) + ARR_GIA(I)*TO_NUMBER(ARR_SL(I))
        WHERE MALX = ARR_MALX(I);
        dbms_output.put_line(ARR_DOANHTHU(I) + ARR_GIA(I)*TO_NUMBER(ARR_SL(I)));
    END LOOP;
    
    --insert vô CHITIETDATXE
    FOR I IN 1..ARR_MALX.COUNT LOOP
        INSERT INTO CHITIETDATXE VALUES(V_MADX, ARR_MALX(I), TO_NUMBER(ARR_SL(I)));
        
        --chọn xe theo loaixe mà khách yêu cầu rồi chuyển tình trạng xe đó và insert vào xethue 
        FOR J IN 1..TO_NUMBER(ARR_SL(I)) LOOP
            SELECT MAXE INTO V_MAXE
            FROM XE 
            WHERE MALX = ARR_MALX(I) AND TINHTRANG = 'SAN SANG'
            FETCH FIRST 1 ROWS ONLY;
            
            UPDATE XE 
            SET TINHTRANG = 'DANG THUE'
            WHERE MAXE = V_MAXE;
            
            INSERT INTO XETHUE VALUES(V_MADX, V_MAXE);
        END LOOP;
        
    END LOOP;
    sleep(10);
END;



---------------------------------------------------------------------------------------------------------------------------

--------------------------------------PROCEDURE 5: LAP HOA DON-------------------------------------------------------------
create or replace PROCEDURE LAPHOADON (V_SOHOPDONG IN varchar, V_MANV varchar, V_TRASAU FLOAT, V_PHIPS VARCHAR, V_LYDO VARCHAR, V_NNX VARCHAR, V_NTX VARCHAR)
IS
    V_SOHOADON varchar(10);
    V_NGAYHIENTAI DATE;
    V_TRIGIA FLOAT;
    V_TRATRUOC FLOAT;
    V_MADX varchar(10);
    V_DOANHTHU FLOAT;
    V_MALX VARCHAR2(10);
    V_GIA FLOAT;
    V_NGAYNHANXE DATE;
    V_MAXE VARCHAR(10);
    CURSOR CUR IS SELECT MAXE FROM XETHUE WHERE MADX = (SELECT MADX FROM HOPDONG WHERE SOHOPDONG = V_SOHOPDONG);
BEGIN           
    V_SOHOADON := 'HDN'||HOADON_SEQ.NEXTVAL;
    SELECT TRATRUOC, MADX, NGAYNHANXE INTO V_TRATRUOC, V_MADX, V_NGAYNHANXE FROM HOPDONG WHERE SOHOPDONG = V_SOHOPDONG;
    dbms_output.put_line(V_MADX);
    V_TRIGIA := V_TRATRUOC + V_TRASAU + V_PHIPS;

    SELECT CURRENT_DATE INTO V_NGAYHIENTAI
    FROM DUAL;

    INSERT INTO HOADON VALUES(V_SOHOADON, V_SOHOPDONG, V_MANV, V_NGAYHIENTAI, V_TRATRUOC, V_TRASAU, V_PHIPS, V_LYDO, V_TRIGIA, V_NGAYNHANXE, TO_DATE(V_NTX, 'DD/MM/YYYY'));

    OPEN CUR; 
    LOOP
        FETCH CUR INTO V_MAXE;
        EXIT WHEN CUR%NOTFOUND;
        
        UPDATE XE
        SET TINHTRANG = 'SAN SANG'
        WHERE MAXE = V_MAXE;
        
        SELECT MALX INTO V_MALX FROM XE WHERE MAXE = V_MAXE; 
        
        SELECT DOANHTHU, GIA INTO V_DOANHTHU, V_GIA FROM LOAIXE WHERE MALX = V_MALX;
        
        UPDATE LOAIXE   
        SET DOANHTHU = V_DOANHTHU + V_GIA
        WHERE MALX = V_MALX;
         
        INSERT INTO CHITIETHOADON VALUES (V_SOHOADON, V_MAXE);
    END LOOP;
    CLOSE CUR;
END;


--------------------------------------PROCEDURE 6: Cap nhat blacklist-------------------------------------------------------------
CREATE OR REPLACE PROCEDURE THEMBLACKLIST (V_MAKH IN varchar)
IS
BEGIN
    UPDATE KHACHHANG
    SET DANHDAU = DANHDAU+1
    WHERE MAKH = V_MAKH;
END;
--------------------------------------PROCEDURE 7: IN HOP DONG-------------------------------------------------------------

CREATE OR REPLACE PROCEDURE IN_HOP_DONG(IN_SOHOPDONG IN varchar)
IS
    V_MALX varchar(10);
    V_MADX varchar(10);
    V_SL NUMBER;
    V_TENKH VARCHAR(100);
    V_NGAYHD DATE;
    V_NNX DATE;
    V_NTX DATE;
    V_TENLX VARCHAR(100);
    CURSOR CUR IS SELECT MALX, SOLUONG FROM CHITIETHOPDONG WHERE SOHOPDONG = IN_SOHOPDONG;
BEGIN
    SELECT MADX, NGAYHD, NGAYNHANXE, NGAYTRAXE INTO V_MADX, V_NGAYHD, V_NNX, V_NTX 
    FROM HOPDONG
    WHERE SOHOPDONG = IN_SOHOPDONG;
    
    SELECT TENND INTO V_TENKH FROM DONDATXE D JOIN HOPDONG HD ON D.MADX = HD.MADX JOIN NGUOIDUNG ND ON ND.MAND = D.MAKH WHERE D.MADX = V_MADX;
    
    DBMS_OUTPUT.PUT_LINE('So hop dong: ' || IN_SOHOPDONG);
    DBMS_OUTPUT.PUT_LINE('*Ten khach hang: ' || V_TENKH);
    DBMS_OUTPUT.PUT_LINE('*Ngay hop dong: ' || V_NGAYHD);
    DBMS_OUTPUT.PUT_LINE('*Ngay nhan xe: ' || V_NNX);
    DBMS_OUTPUT.PUT_LINE('*Ngay tra xe: ' || V_NTX);
    DBMS_OUTPUT.PUT_LINE('******Danh sach loai xe: ' || V_NTX);
    OPEN CUR;
    LOOP
        FETCH CUR INTO V_MALX, V_SL;  
        EXIT WHEN CUR%notfound;
        SELECT TENLX INTO V_TENLX FROM LOAIXE WHERE MALX = V_MALX;
        DBMS_OUTPUT.PUT_LINE('------------------Ten: '|| V_TENLX || ', So luong: '|| V_SL);
    END LOOP;

    CLOSE CUR;
END;

--------------------------------------PROCEDURE 8: SUA LOAI XE-------------------------------------------------------------

CREATE OR REPLACE PROCEDURE SUA_LOAI_XE(IN_MALX IN varchar, IN_TENLX varchar, IN_SOCHO NUMBER, IN_GIA FLOAT, IN_NGOAIGIO FLOAT)
IS

BEGIN
    UPDATE LOAIXE
    SET TENLX = IN_TENLX, socho = IN_SOCHO, gia = IN_GIA, ngoaigio = IN_NGOAIGIO
    WHERE MALX = IN_MALX;
END;


--------------------------------------PROCEDURE 9: THEM CHI TIET HOP DONG------------------------------------------------------------

CREATE OR REPLACE PROCEDURE THEM_CTHD(IN_SOHOPDONG IN varchar, IN_MALX varchar, IN_SL NUMBER, IN_GHICHU varchar)
IS
    V_GIA FLOAT;
BEGIN
    SELECT IN_SL*GIA INTO V_GIA FROM LOAIXE WHERE MALX = IN_MALX;
    INSERT INTO CHITIETHOPDONG VALUES(IN_SOHOPDONG, IN_MALX, IN_SL, V_GIA, IN_GHICHU);
END;


BEGIN
    TAOHOPDONG('DX16', 'ND10');
END;
/*
--TEST--

BEGIN
    IN_HOP_DONG('HDG303')
END;
begin
    dangky('Nguyen Van AadDDDDD', 'nguyenvana', 'nguyenvana@gmail.com', '123', 'Ha Noi', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', 'https://res.cloudinary.com/dhshtvtrl/image/upload/v1646103768/wxx2zrkpbyal4pwqgx2d.jpg', '0987654321', '', '');
end;

--TEST:
BEGIN
    TAOHOPDONG('DX43', 'NV02', '','','');
END;

BEGIN
    THUEXE('ND12', '01/10/2021', '02/10/2021', 'LX80,LX81', '1,2'); 
END;

BEGIN
    LAPHOADON('HDG303', 'ND10', 10, 0, '', '01/10/2021', '02/10/2021');
END;

BEGIN 
    THUEXE('ND12', '01/10/2021', '02/10/2021', 'LX80,LX81', '1,2'); 
END;

BEGIN
    THEMBLACKLIST('ND12');
END;

BEGIN
    THEMBLACKLIST('ND12');
END;


SELECT * FROM KHACHHANG
*/





















































































    









