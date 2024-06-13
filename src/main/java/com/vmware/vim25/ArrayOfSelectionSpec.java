package com.vmware.vim25;

import com.vmware.vim25.ArrayOfSelectionSpec;
import com.vmware.vim25.SelectionSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSelectionSpec", propOrder = {"selectionSpec"})
public class ArrayOfSelectionSpec {
  @XmlElement(name = "SelectionSpec")
  protected List<SelectionSpec> selectionSpec;
  
  public List<SelectionSpec> getSelectionSpec() {
    if (this.selectionSpec == null)
      this.selectionSpec = new ArrayList<>(); 
    return this.selectionSpec;
  }
}
