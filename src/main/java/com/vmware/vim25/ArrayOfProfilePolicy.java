package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfilePolicy;
import com.vmware.vim25.ProfilePolicy;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfilePolicy", propOrder = {"profilePolicy"})
public class ArrayOfProfilePolicy {
  @XmlElement(name = "ProfilePolicy")
  protected List<ProfilePolicy> profilePolicy;
  
  public List<ProfilePolicy> getProfilePolicy() {
    if (this.profilePolicy == null)
      this.profilePolicy = new ArrayList<>(); 
    return this.profilePolicy;
  }
}
