package ssy.com.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class OrderInfo {
private Integer orderId;
private String patientName;
private Date reserveDate;
}
