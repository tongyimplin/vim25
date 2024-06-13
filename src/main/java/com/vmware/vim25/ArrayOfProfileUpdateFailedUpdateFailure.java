package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfileUpdateFailedUpdateFailure;
import com.vmware.vim25.ProfileUpdateFailedUpdateFailure;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileUpdateFailedUpdateFailure", propOrder = {"profileUpdateFailedUpdateFailure"})
public class ArrayOfProfileUpdateFailedUpdateFailure {
  @XmlElement(name = "ProfileUpdateFailedUpdateFailure")
  protected List<ProfileUpdateFailedUpdateFailure> profileUpdateFailedUpdateFailure;
  
  public List<ProfileUpdateFailedUpdateFailure> getProfileUpdateFailedUpdateFailure() {
    if (this.profileUpdateFailedUpdateFailure == null)
      this.profileUpdateFailedUpdateFailure = new ArrayList<>(); 
    return this.profileUpdateFailedUpdateFailure;
  }
}
