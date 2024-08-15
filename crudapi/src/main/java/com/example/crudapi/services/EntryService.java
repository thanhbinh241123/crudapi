package com.example.crudapi.services;

import com.example.crudapi.dtos.EntryDTO;
import com.example.crudapi.models.CreateEntryModel;
import com.example.crudapi.models.UpdateEntryModel;

import java.util.List;

public interface EntryService {
    EntryDTO createEntry(CreateEntryModel createEntryModel);
    EntryDTO updateEntry(Long id, UpdateEntryModel updateEntryModel);
    void deleteEntry(Long id);
    EntryDTO getEntryById(Long id);
    List<EntryDTO> getAllEntries();
}