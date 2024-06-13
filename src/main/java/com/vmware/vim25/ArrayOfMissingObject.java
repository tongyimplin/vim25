package com.vmware.vim25;

import com.vmware.vim25.ArrayOfMissingObject;
import com.vmware.vim25.MissingObject;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMissingObject", propOrder = {"missingObject"})
public class ArrayOfMissingObject {
  @XmlElement(name = "MissingObject")
  protected List<MissingObject> missingObject;
  
  public List<MissingObject> getMissingObject() {
    if (this.missingObject == null)
      this.missingObject = new ArrayList<>(); 
    return this.missingObject;
  }
}
