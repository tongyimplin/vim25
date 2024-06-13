package com.vmware.vim25;

import com.vmware.vim25.DvsFault;
import com.vmware.vim25.ImportOperationBulkFault;
import com.vmware.vim25.ImportOperationBulkFaultFaultOnImport;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportOperationBulkFault", propOrder = {"importFaults"})
public class ImportOperationBulkFault extends DvsFault {
  @XmlElement(required = true)
  protected List<ImportOperationBulkFaultFaultOnImport> importFaults;
  
  public List<ImportOperationBulkFaultFaultOnImport> getImportFaults() {
    if (this.importFaults == null)
      this.importFaults = new ArrayList<>(); 
    return this.importFaults;
  }
}
