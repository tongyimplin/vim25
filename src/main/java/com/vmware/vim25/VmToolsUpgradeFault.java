package com.vmware.vim25;

import com.vmware.vim25.ToolsAlreadyUpgraded;
import com.vmware.vim25.ToolsAutoUpgradeNotSupported;
import com.vmware.vim25.ToolsImageCopyFailed;
import com.vmware.vim25.ToolsImageNotAvailable;
import com.vmware.vim25.ToolsImageSignatureCheckFailed;
import com.vmware.vim25.ToolsUpgradeCancelled;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmToolsUpgradeFault")
@XmlSeeAlso({ToolsAlreadyUpgraded.class, ToolsUpgradeCancelled.class, ToolsImageNotAvailable.class, ToolsAutoUpgradeNotSupported.class, ToolsImageCopyFailed.class, ToolsImageSignatureCheckFailed.class})
public class VmToolsUpgradeFault extends VimFault {}
