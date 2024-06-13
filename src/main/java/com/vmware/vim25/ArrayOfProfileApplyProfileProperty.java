package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfileApplyProfileProperty;
import com.vmware.vim25.ProfileApplyProfileProperty;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileApplyProfileProperty", propOrder = {"profileApplyProfileProperty"})
public class ArrayOfProfileApplyProfileProperty {
  @XmlElement(name = "ProfileApplyProfileProperty")
  protected List<ProfileApplyProfileProperty> profileApplyProfileProperty;
  
  public List<ProfileApplyProfileProperty> getProfileApplyProfileProperty() {
    if (this.profileApplyProfileProperty == null)
      this.profileApplyProfileProperty = new ArrayList<>(); 
    return this.profileApplyProfileProperty;
  }
}
