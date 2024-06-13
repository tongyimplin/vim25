package com.vmware.vim25;

import com.vmware.vim25.ProfileUpdateFailed;
import com.vmware.vim25.ProfileUpdateFailedUpdateFailure;
import com.vmware.vim25.VimFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileUpdateFailed", propOrder = {"failure", "warnings"})
public class ProfileUpdateFailed extends VimFault {
  @XmlElement(required = true)
  protected List<ProfileUpdateFailedUpdateFailure> failure;
  
  protected List<ProfileUpdateFailedUpdateFailure> warnings;
  
  public List<ProfileUpdateFailedUpdateFailure> getFailure() {
    if (this.failure == null)
      this.failure = new ArrayList<>(); 
    return this.failure;
  }
  
  public List<ProfileUpdateFailedUpdateFailure> getWarnings() {
    if (this.warnings == null)
      this.warnings = new ArrayList<>(); 
    return this.warnings;
  }
}
