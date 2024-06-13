package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ProfileProfileStructure;
import com.vmware.vim25.ProfileProfileStructureProperty;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileProfileStructure", propOrder = {"profileTypeName", "child"})
public class ProfileProfileStructure extends DynamicData {
  @XmlElement(required = true)
  protected String profileTypeName;
  
  protected List<ProfileProfileStructureProperty> child;
  
  public String getProfileTypeName() {
    return this.profileTypeName;
  }
  
  public void setProfileTypeName(String paramString) {
    this.profileTypeName = paramString;
  }
  
  public List<ProfileProfileStructureProperty> getChild() {
    if (this.child == null)
      this.child = new ArrayList<>(); 
    return this.child;
  }
}
