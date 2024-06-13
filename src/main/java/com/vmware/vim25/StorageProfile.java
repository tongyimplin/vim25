package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.NasStorageProfile;
import com.vmware.vim25.StorageProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageProfile", propOrder = {"nasStorage"})
public class StorageProfile extends ApplyProfile {
  protected List<NasStorageProfile> nasStorage;
  
  public List<NasStorageProfile> getNasStorage() {
    if (this.nasStorage == null)
      this.nasStorage = new ArrayList<>(); 
    return this.nasStorage;
  }
}
