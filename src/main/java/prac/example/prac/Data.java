package prac.example.prac;

import jakarta.validation.constraints.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Data {
    @NotNull
  private  String name;
    @Max(value=25)
   private  int age;
@Email(
regexp="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")
private String email;

@Min(value=10)
   private int roll;
@NotEmpty
    private String job;
@NotBlank
private String hobby;
@Past(message = "the date is not in past")
private LocalDate pacdate;
@Future(message = "the date is not in future")
private LocalDate expdate;

    public LocalDate getPacdate() {
        return pacdate;
    }

    public void setPacdate(LocalDate pacdate) {
        this.pacdate = pacdate;
    }

    public LocalDate getExpdate() {
        return expdate;
    }

    public void setExpdate(LocalDate expdate) {
        this.expdate = expdate;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

