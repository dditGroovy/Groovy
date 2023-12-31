package kr.co.groovy.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class JobDiaryVO {
    private Date jobDiaryReportDate;
    private String jobDiaryWrtingEmplId;
    private String jobDiaryRecptnEmplId;
    private String jobDiarySbj;
    private String jobDiaryCn;
}
