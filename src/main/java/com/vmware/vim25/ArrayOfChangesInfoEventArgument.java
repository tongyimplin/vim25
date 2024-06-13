package com.vmware.vim25;

import com.vmware.vim25.ArrayOfChangesInfoEventArgument;
import com.vmware.vim25.ChangesInfoEventArgument;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChangesInfoEventArgument", propOrder = {"changesInfoEventArgument"})
public class ArrayOfChangesInfoEventArgument {
  @XmlElement(name = "ChangesInfoEventArgument")
  protected List<ChangesInfoEventArgument> changesInfoEventArgument;
  
  public List<ChangesInfoEventArgument> getChangesInfoEventArgument() {
    if (this.changesInfoEventArgument == null)
      this.changesInfoEventArgument = new ArrayList<>(); 
    return this.changesInfoEventArgument;
  }
}
