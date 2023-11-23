package sg.edu.nus.ssf.day13work.model;

import java.util.Date;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Employee {

    @NotEmpty(message = "First name cannot be empty.")
    @Size(min = 3, max = 20, message = "First name must be between 3-20 characters")
    private String firstName;

    @NotEmpty(message = "First name cannot be empty.")
    @Size(min = 3, max = 20, message = "First name must be between 3-20 characters")
    private String lastName;

    @Email(message = "Please input a valid email address.")
    @NotBlank(message = "Email cannot be empty.")
    private String email;
    
    @Pattern(regexp = "(\\8|9)[0-9]{7}", message = "Please inout a valid phone number.") 
    @NotBlank(message = "Phone number cannot be empty.") //first digit can be 8 or 9, subsequently expecting 7 other digits between 0-9
    private String phone;

    @Min(value = 1500, message = "Salary must be at least $1,500.")
    @Max(value = 500000, message = "Salary cannot exceed $500,000")
    private Integer salary;

    @Past(message = "Birthday cannot be on or after the current date.")
    private Date birthday;

    @Digits(fraction = 0, integer = 6, message = "Please input a valid postal code.")
    private Integer postalCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

}
