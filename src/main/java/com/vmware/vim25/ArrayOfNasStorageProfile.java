package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNasStorageProfile;
import com.vmware.vim25.NasStorageProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNasStorageProfile", propOrder = {"nasStorageProfile"})
public class ArrayOfNasStorageProfile {
  @XmlElement(name = "NasStorageProfile")
  protected List<NasStorageProfile> nasStorageProfile;
  
  public List<NasStorageProfile> getNasStorageProfile() {
    if (this.nasStorageProfile == null)
      this.nasStorageProfile = new ArrayList<>(); 
    return this.nasStorageProfile;
  }
}
