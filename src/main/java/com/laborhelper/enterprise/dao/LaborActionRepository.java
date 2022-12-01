package com.laborhelper.enterprise.dao;

import com.laborhelper.enterprise.dto.LaborAction;
import com.sun.xml.bind.v2.runtime.reflect.opt.FieldAccessor_Integer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.context.annotation.Profile;
@Profile("!test")
public interface LaborActionRepository extends CrudRepository<LaborAction, Integer> {
}
