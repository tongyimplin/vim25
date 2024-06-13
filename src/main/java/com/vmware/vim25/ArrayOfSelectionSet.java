package com.vmware.vim25;

import com.vmware.vim25.ArrayOfSelectionSet;
import com.vmware.vim25.SelectionSet;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSelectionSet", propOrder = {"selectionSet"})
public class ArrayOfSelectionSet {
  @XmlElement(name = "SelectionSet")
  protected List<SelectionSet> selectionSet;
  
  public List<SelectionSet> getSelectionSet() {
    if (this.selectionSet == null)
      this.selectionSet = new ArrayList<>(); 
    return this.selectionSet;
  }
}
