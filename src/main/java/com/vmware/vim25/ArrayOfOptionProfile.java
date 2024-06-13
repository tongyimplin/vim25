package com.vmware.vim25;

import com.vmware.vim25.ArrayOfOptionProfile;
import com.vmware.vim25.OptionProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOptionProfile", propOrder = {"optionProfile"})
public class ArrayOfOptionProfile {
  @XmlElement(name = "OptionProfile")
  protected List<OptionProfile> optionProfile;
  
  public List<OptionProfile> getOptionProfile() {
    if (this.optionProfile == null)
      this.optionProfile = new ArrayList<>(); 
    return this.optionProfile;
  }
}
