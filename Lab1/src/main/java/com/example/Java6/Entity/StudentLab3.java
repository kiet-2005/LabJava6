package com.example.Java6.Entity;

import jakarta.validation.constraints.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentLab3 {
    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    String email;
    @NotBlank( message = "Họ tên không được để trống")
    String fullname;
    @NotNull(message = "Điểm không được để trống")
    @PositiveOrZero(message = "Điểm phải lớn hơn hoặc bằng 0")
    @Max(value = 10, message = "Điểm không được lớn hơn 10")
    Double mark;
    @NotNull(message = "Giới tính không được để trống")
    Boolean gender;
    @NotBlank(message = "Quê quán không được để trống")
    String country;
}
