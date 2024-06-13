package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ProfileProfileStructure;
import com.vmware.vim25.ProfileProfileStructureProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileProfileStructureProperty", propOrder = {"propertyName", "array", "element"})
public class ProfileProfileStructureProperty extends DynamicData {
  @XmlElement(required = true)
  protected String propertyName;
  
  protected boolean array;
  
  @XmlElement(required = true)
  protected ProfileProfileStructure element;
  
  public String getPropertyName() {
    return this.propertyName;
  }
  
  public void setPropertyName(String paramString) {
    this.propertyName = paramString;
  }
  
  public boolean isArray() {
    return this.array;
  }
  
  public void setArray(boolean paramBoolean) {
    this.array = paramBoolean;
  }
  
  public ProfileProfileStructure getElement() {
    return this.element;
  }
  
  public void setElement(ProfileProfileStructure paramProfileProfileStructure) {
    this.element = paramProfileProfileStructure;
  }
}
