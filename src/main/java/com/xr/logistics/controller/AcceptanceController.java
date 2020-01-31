package com.xr.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AcceptanceController {
    @RequestMapping("/businessAcceptance")
    public String businessAcceptance() {
        return "/pages/acceptance/businessAcceptance";
    }

    @RequestMapping("/worksheetQuickInput")
    public String worksheetQuickInput() {
        return "/pages/acceptance/worksheetQuickInput";
    }

    @RequestMapping("/worksheetQuery")
    public String worksheetQuery() {
        return "/pages/acceptance/worksheetQuery";
    }

    @RequestMapping("/checkTable")
    public String checkTable() {
        return "/pages/dispatch/checkTable";
    }

    @RequestMapping("/manualScheduling")
    public String manualScheduling() {
        return "/pages/dispatch/manualScheduling";
    }

    @RequestMapping("/signInput")
    public String signInput() {
        return "/pages/dispatch/signInput";
    }

    @RequestMapping("/cancelSignApplicationConfirmation")
    public String cancelSignApplicationConfirmation() {
        return "/pages/dispatch/cancelSignApplicationConfirmation";
    }

    @RequestMapping("/propagandaTask")
    public String propagandaTask() {
        return "/pages/dispatch/propagandaTask";
    }

    @RequestMapping("/returnApply")
    public String returnApply() {
        return "/pages/return/returnApply";
    }

    @RequestMapping("/returnApplyConfirm")
    public String returnApplyConfirm() {
        return "/pages/return/returnApplyConfirm";
    }

    @RequestMapping("/returnInvoiceProduce")
    public String returnInvoiceProduce() {
        return "/pages/return/returnInvoiceProduce";
    }
}
