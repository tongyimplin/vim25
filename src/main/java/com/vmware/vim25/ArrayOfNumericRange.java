package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNumericRange;
import com.vmware.vim25.NumericRange;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNumericRange", propOrder = {"numericRange"})
public class ArrayOfNumericRange {
  @XmlElement(name = "NumericRange")
  protected List<NumericRange> numericRange;
  
  public List<NumericRange> getNumericRange() {
    if (this.numericRange == null)
      this.numericRange = new ArrayList<>(); 
    return this.numericRange;
  }
}
