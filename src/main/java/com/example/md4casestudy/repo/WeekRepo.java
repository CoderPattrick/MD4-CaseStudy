package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.DTO.WeeklySalaryOfAllCoach;
import com.example.md4casestudy.model.salary.Week;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface WeekRepo extends JpaRepository<Week,Long> {
    @Modifying
    //Lưu ý câu query không được có dấu ';'
    //Câu query có tham số nên có @Transaction @Modifying (cường bảo thế)
    @Query(value = "select c.name as coach,n.name as nationality,c.dob as coach_dob,w.first_day_of_the_week as week,cs.weekly_salary as weekly_salary from coach c join nationality n on n.id = c.nationality_id join coach_salary cs on c.id = cs.coach_id join week w on w.id = cs.week_id where w.id = ?1",nativeQuery = true)
    Iterable<WeeklySalaryOfAllCoach> getWeeklySalaryOfAllCoach(Long id);
}
