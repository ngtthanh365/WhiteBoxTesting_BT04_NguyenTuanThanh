🧪 DANH SÁCH TEST CASE
🔹 Bài 1: Chu vi hình chữ nhật
| Input (a,b) | Expected  | Loại   |
| ----------- | --------- | ------ |
| (3,4)       | 14        | Hợp lệ |
| (1,1)       | 4         | Biên   |
| (-1,4)      | Exception | Lỗi    |
| (0,5)       | Exception | Biên   |

🔹 Bài 2: Diện tích hình chữ nhật
| Input (a,b) | Expected  | Loại   |
| ----------- | --------- | ------ |
| (3,4)       | 12        | Hợp lệ |
| (1,1)       | 1         | Biên   |
| (-2,5)      | Exception | Lỗi    |
| (5,0)       | Exception | Biên   |

🔹 Bài 3: Phương trình bậc 2
| Input (a,b,c) | Expected     | Loại   |
| ------------- | ------------ | ------ |
| (1,-3,2)      | 2 nghiệm     | Hợp lệ |
| (1,2,1)       | 1 nghiệm     | Biên   |
| (1,0,1)       | vô nghiệm    | Hợp lệ |
| (0,2,-4)      | PT bậc 1     | Biên   |
| (0,0,0)       | vô số nghiệm | Biên   |

🔹 Bài 4: Số ngày trong tháng
| Input | Expected  | Loại   |
| ----- | --------- | ------ |
| 1     | 31        | Hợp lệ |
| 2     | 28        | Biên   |
| 4     | 30        | Hợp lệ |
| 7     | 31        | Hợp lệ |
| 13    | Exception | Lỗi    |
| 0     | Exception | Biên   |

🔹 Bài 5: Số nguyên tố
| Input | Expected  | Loại   |
| ----- | --------- | ------ |
| 7     | true      | Hợp lệ |
| 2     | true      | Biên   |
| 1     | false     | Biên   |
| 10    | false     | Hợp lệ |
| -5    | Exception | Lỗi    |

🔹 Bài 6: Tổng S = 1-2+3-4+...+n
| Input | Expected  | Loại   |
| ----- | --------- | ------ |
| 5     | 3         | Hợp lệ |
| 1     | 1         | Biên   |
| 2     | -1        | Biên   |
| 0     | Exception | Lỗi    |

🔹 Bài 7: UCLN
| Input (a,b) | Expected  | Loại       |
| ----------- | --------- | ---------- |
| (54,24)     | 6         | Hợp lệ     |
| (5,5)       | 5         | Biên       |
| (10,5)      | 5         | Chia hết   |
| (5,10)      | 5         | Đảo        |
| (8,4)       | 4         | Loop 1 lần |
| (0,5)       | Exception | Lỗi        |

🔹 Bài 8: Tổng giai thừa
| Input        | Expected  | Loại   |
| ------------ | --------- | ------ |
| 1            | 1         | Biên   |
| 2            | 3         | Hợp lệ |
| 3            | 9         | Hợp lệ |
| 5            | 153       | Hợp lệ |
| 0            | Exception | Lỗi    |
| factorial(0) | 1         | Biên   |
