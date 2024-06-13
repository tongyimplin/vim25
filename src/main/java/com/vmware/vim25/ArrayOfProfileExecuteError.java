package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfileExecuteError;
import com.vmware.vim25.ProfileExecuteError;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileExecuteError", propOrder = {"profileExecuteError"})
public class ArrayOfProfileExecuteError {
  @XmlElement(name = "ProfileExecuteError")
  protected List<ProfileExecuteError> profileExecuteError;
  
  public List<ProfileExecuteError> getProfileExecuteError() {
    if (this.profileExecuteError == null)
      this.profileExecuteError = new ArrayList<>(); 
    return this.profileExecuteError;
  }
}
