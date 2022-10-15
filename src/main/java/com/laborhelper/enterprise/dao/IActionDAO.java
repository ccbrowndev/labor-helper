package com.laborhelper.enterprise.dao;

import com.laborhelper.enterprise.dto.Action;

import java.io.IOException;
import java.util.List;

public interface IActionDAO {

    List<Action> fetchAction(String combinedName) throws IOException;

}
