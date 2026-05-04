# 🧪 BÀI THỰC HÀNH 04 - KIỂM THỬ HỘP TRẮNG (WHITE-BOX TESTING)

## 👨‍🎓 Thông tin
- Họ tên: Nguyễn Tuấn Thành
- Môn học: Đánh giá và kiểm định chất lượng phần mềm
- Công nghệ: Java + Maven + JUnit + JaCoCo

---

## 📌 Mô tả
Dự án thực hiện kiểm thử hộp trắng cho 8 bài toán cơ bản:
1. Chu vi hình chữ nhật
2. Diện tích hình chữ nhật
3. Giải phương trình bậc 2
4. Số ngày của một tháng
5. Kiểm tra số nguyên tố
6. Tổng S = 1 - 2 + 3 - 4 + ... + n
7. UCLN của a và b
8. Tổng S = 1! + 2! + ... + n!

---

## ⚙️ Cách chạy

```bash
mvn clean test

## 🧪 Công cụ sử dụng
JUnit 5: viết test
Maven: build & run
JaCoCo: đo coverage
📊 Kết quả kiểm thử
✔ Tất cả test PASS
✔ Không có lỗi runtime
✔ Coverage cao (gần 100%)

## 📸 Ảnh minh chứng:

Log chạy test (BUILD SUCCESS)
Coverage report: target/site/jacoco/index.html

## 🔍 Phân tích kiểm thử hộp trắng
🔹 Bài 1 & 2
Statement: kiểm tra điều kiện + tính toán
Branch:
hợp lệ
a <= 0 hoặc b <= 0 → exception
Path:
path hợp lệ
path lỗi

🔹 Bài 3 (PT bậc 2)
Branch:
delta > 0 → 2 nghiệm
delta = 0 → 1 nghiệm
delta < 0 → vô nghiệm
a = 0 → PT bậc 1

🔹 Bài 4 (Switch)
Branch:
tháng 31 ngày
tháng 30 ngày
tháng 2
invalid → exception

🔹 Bài 5 (Nguyên tố)
Loop:
không vào loop
vào loop nhiều lần
Branch:
chia hết → false
không chia hết → true

🔹 Bài 6 (Tổng xen kẽ)
Loop:
1 lần
nhiều lần
Branch:
n <= 0 → exception

🔹 Bài 7 (UCLN)
Loop:
1 lần
nhiều lần
Branch:
a <= 0 hoặc b <= 0 → exception
b == 0 → thoát

🔹 Bài 8 (Giai thừa + tổng)
Recursion:
n = 0,1 → base case
n > 1 → recursive
Loop:
1 lần
nhiều lần

📋 Test case

Chi tiết tại file: testcases.md

📝 Nhận xét
Đã bao phủ:
✔ tất cả câu lệnh (statement)
✔ tất cả nhánh (branch)
✔ vòng lặp (0,1,n lần)
✔ ngoại lệ
Coverage đạt mức cao, đảm bảo chất lượng chương trình