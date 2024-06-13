package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.ArrayOfApplyProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfApplyProfile", propOrder = {"applyProfile"})
public class ArrayOfApplyProfile {
  @XmlElement(name = "ApplyProfile")
  protected List<ApplyProfile> applyProfile;
  
  public List<ApplyProfile> getApplyProfile() {
    if (this.applyProfile == null)
      this.applyProfile = new ArrayList<>(); 
    return this.applyProfile;
  }
}
