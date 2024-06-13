package com.vmware.vim25;

import com.vmware.vim25.ArrayOfCustomFieldValue;
import com.vmware.vim25.CustomFieldValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomFieldValue", propOrder = {"customFieldValue"})
public class ArrayOfCustomFieldValue {
  @XmlElement(name = "CustomFieldValue")
  protected List<CustomFieldValue> customFieldValue;
  
  public List<CustomFieldValue> getCustomFieldValue() {
    if (this.customFieldValue == null)
      this.customFieldValue = new ArrayList<>(); 
    return this.customFieldValue;
  }
}
