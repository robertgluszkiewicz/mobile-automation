package com.robertgluszkiewicz.carina.demo.db.mappers;

import com.robertgluszkiewicz.carina.demo.db.models.UserPreference;

public interface UserPreferenceMapper {

	void create(UserPreference userPreference);

	UserPreference findById(Long id);
}
