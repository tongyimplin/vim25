package com.vmware.vim25;

import com.vmware.vim25.ArrayOfIoFilterHostIssue;
import com.vmware.vim25.IoFilterHostIssue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIoFilterHostIssue", propOrder = {"ioFilterHostIssue"})
public class ArrayOfIoFilterHostIssue {
  @XmlElement(name = "IoFilterHostIssue")
  protected List<IoFilterHostIssue> ioFilterHostIssue;
  
  public List<IoFilterHostIssue> getIoFilterHostIssue() {
    if (this.ioFilterHostIssue == null)
      this.ioFilterHostIssue = new ArrayList<>(); 
    return this.ioFilterHostIssue;
  }
}
