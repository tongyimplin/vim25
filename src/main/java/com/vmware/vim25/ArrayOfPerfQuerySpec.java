package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPerfQuerySpec;
import com.vmware.vim25.PerfQuerySpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerfQuerySpec", propOrder = {"perfQuerySpec"})
public class ArrayOfPerfQuerySpec {
  @XmlElement(name = "PerfQuerySpec")
  protected List<PerfQuerySpec> perfQuerySpec;
  
  public List<PerfQuerySpec> getPerfQuerySpec() {
    if (this.perfQuerySpec == null)
      this.perfQuerySpec = new ArrayList<>(); 
    return this.perfQuerySpec;
  }
}
