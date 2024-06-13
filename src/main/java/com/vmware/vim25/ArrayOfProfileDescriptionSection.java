package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfileDescriptionSection;
import com.vmware.vim25.ProfileDescriptionSection;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileDescriptionSection", propOrder = {"profileDescriptionSection"})
public class ArrayOfProfileDescriptionSection {
  @XmlElement(name = "ProfileDescriptionSection")
  protected List<ProfileDescriptionSection> profileDescriptionSection;
  
  public List<ProfileDescriptionSection> getProfileDescriptionSection() {
    if (this.profileDescriptionSection == null)
      this.profileDescriptionSection = new ArrayList<>(); 
    return this.profileDescriptionSection;
  }
}
