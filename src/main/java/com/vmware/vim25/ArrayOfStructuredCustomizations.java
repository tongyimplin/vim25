package com.vmware.vim25;

import com.vmware.vim25.ArrayOfStructuredCustomizations;
import com.vmware.vim25.StructuredCustomizations;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStructuredCustomizations", propOrder = {"structuredCustomizations"})
public class ArrayOfStructuredCustomizations {
  @XmlElement(name = "StructuredCustomizations")
  protected List<StructuredCustomizations> structuredCustomizations;
  
  public List<StructuredCustomizations> getStructuredCustomizations() {
    if (this.structuredCustomizations == null)
      this.structuredCustomizations = new ArrayList<>(); 
    return this.structuredCustomizations;
  }
}
