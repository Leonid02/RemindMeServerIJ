package com.alm.remindme.server.repository;

import com.alm.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind,Long> {
}
