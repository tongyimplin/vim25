package com.vmware.vim25;

import com.vmware.vim25.ArrayOfCustomFieldDef;
import com.vmware.vim25.CustomFieldDef;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomFieldDef", propOrder = {"customFieldDef"})
public class ArrayOfCustomFieldDef {
  @XmlElement(name = "CustomFieldDef")
  protected List<CustomFieldDef> customFieldDef;
  
  public List<CustomFieldDef> getCustomFieldDef() {
    if (this.customFieldDef == null)
      this.customFieldDef = new ArrayList<>(); 
    return this.customFieldDef;
  }
}
