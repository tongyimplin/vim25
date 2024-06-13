package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ProfileDescription;
import com.vmware.vim25.ProfileDescriptionSection;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileDescription", propOrder = {"section"})
public class ProfileDescription extends DynamicData {
  @XmlElement(required = true)
  protected List<ProfileDescriptionSection> section;
  
  public List<ProfileDescriptionSection> getSection() {
    if (this.section == null)
      this.section = new ArrayList<>(); 
    return this.section;
  }
}
