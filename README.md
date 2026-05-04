# 🧪 BÀI THỰC HÀNH 04 - KIỂM THỬ HỘP TRẮNG (WHITE-BOX TESTING)

## 👨‍🎓 Thông tin sinh viên

* Họ tên: Nguyễn Tuấn Thành
* Môn học: Đánh giá và kiểm định chất lượng phần mềm
* Công nghệ sử dụng: Java, Maven, JUnit 5, JaCoCo

---

## 📌 Mô tả bài thực hành

Bài thực hành nhằm áp dụng **kiểm thử hộp trắng (White-box Testing)** cho 8 bài toán cơ bản, tập trung vào:

* Phân tích cấu trúc mã nguồn
* Xác định các nhánh điều kiện, vòng lặp
* Thiết kế test case đạt độ bao phủ cao

---

## 📂 Danh sách bài toán

1. Tính chu vi hình chữ nhật
2. Tính diện tích hình chữ nhật
3. Giải phương trình bậc 2
4. Tính số ngày của một tháng
5. Kiểm tra số nguyên tố
6. Tính tổng S = 1 - 2 + 3 - 4 + ... + n
7. Tìm UCLN của a và b
8. Tính tổng S = 1! + 2! + ... + n!

---

## ⚙️ Cách chạy chương trình

### ▶️ Chạy test

```bash
mvn clean test
```

### ▶️ Xem báo cáo coverage

```bash
target/site/jacoco/index.html
```

---

## 🧪 Công cụ sử dụng

* **JUnit 5**: Viết test tự động
* **Maven**: Quản lý project và build
* **JaCoCo**: Đo độ bao phủ mã nguồn

---

## 📊 Kết quả kiểm thử

* ✔ Tất cả test case đều PASS
* ✔ Không có lỗi runtime
* ✔ Coverage đạt mức cao (gần 100%)

📸 Minh chứng:
<img width="1920" height="1080" alt="Screenshot (510)" src="https://github.com/user-attachments/assets/9557b504-35e4-4ae8-817c-992797e3861c" />
* Ảnh log chạy test (BUILD SUCCESS)

<img width="1901" height="897" alt="Ảnh chụp màn hình 2026-05-04 214124" src="https://github.com/user-attachments/assets/c5078228-f9c7-45ac-8017-49f3fb90fa06" />
* Ảnh báo cáo JaCoCo

---

## 🔍 PHÂN TÍCH KIỂM THỬ HỘP TRẮNG

---

### 🔹 Bài 1: Chu vi hình chữ nhật

* **Statement**: kiểm tra điều kiện + phép tính
* **Branch**:

  * a > 0 && b > 0 → hợp lệ
  * a <= 0 hoặc b <= 0 → exception
* **Path**:

  * path hợp lệ
  * path lỗi

---

### 🔹 Bài 2: Diện tích hình chữ nhật

* **Statement**: tính toán đơn giản
* **Branch**:

  * hợp lệ
  * invalid → exception

---

### 🔹 Bài 3: Phương trình bậc 2

* **Branch**:

  * delta > 0 → 2 nghiệm
  * delta = 0 → 1 nghiệm
  * delta < 0 → vô nghiệm
  * a = 0 → phương trình bậc 1
* **Path**:

  * 4 đường đi logic khác nhau

---

### 🔹 Bài 4: Số ngày trong tháng

* **Branch (switch-case)**:

  * tháng 31 ngày
  * tháng 30 ngày
  * tháng 2
  * default → exception

---

### 🔹 Bài 5: Số nguyên tố

* **Loop**:

  * không vào vòng lặp
  * vào nhiều lần
* **Branch**:

  * chia hết → false
  * không chia hết → true
  * n < 2 → false/exception

---

### 🔹 Bài 6: Tổng xen kẽ

* **Loop**:

  * 1 lần
  * nhiều lần
* **Branch**:

  * n <= 0 → exception
  * n > 0 → tính toán

---

### 🔹 Bài 7: UCLN (Thuật toán Euclid)

* **Statement**:

  * kiểm tra điều kiện
  * vòng lặp while
* **Branch**:

  * a <= 0 hoặc b <= 0 → exception
  * b != 0 → tiếp tục lặp
  * b == 0 → thoát
* **Loop**:

  * 1 lần (chia hết ngay)
  * nhiều lần

---

### 🔹 Bài 8: Tổng giai thừa

* **Recursion (factorial)**:

  * n = 0 hoặc 1 → base case
  * n > 1 → đệ quy
* **Loop (tổng)**:

  * 1 lần
  * nhiều lần
* **Branch**:

  * n <= 0 → exception

---

## 📋 Danh sách test case

👉 Xem chi tiết tại: **testcases.md**

Bao gồm:

* Dữ liệu hợp lệ
* Giá trị biên
* Trường hợp lỗi
* Ngoại lệ

---

## 🐙 GitHub Issue

* ✔ Issue 1: Test cho dữ liệu hợp lệ
* ✔ Issue 2: Test cho biên, nhánh, ngoại lệ
* ✔ Đã đóng bằng commit (`close #1`, `close #2`)

---

## 📝 Nhận xét

* Đã áp dụng kiểm thử hộp trắng đầy đủ:

  * ✔ Statement coverage
  * ✔ Branch coverage
  * ✔ Loop coverage
  * ✔ Exception handling
* Hệ thống test đảm bảo bao phủ hầu hết các luồng xử lý
* Độ tin cậy của chương trình được nâng cao

---

## 🔗 GitHub Repository

👉 https://github.com/ngtthanh365/WhiteBoxTesting_BT04_NguyenTuanThanh
