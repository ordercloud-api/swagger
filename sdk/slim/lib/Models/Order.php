<?php
/*
 * Order
 */
namespace \Models;

/*
 * Order
 */
class Order {
    /* @var string $iD  */
    private $iD;
/* @var string $type  */
    private $type;
/* @var string $fromUserID  */
    private $fromUserID;
/* @var string $billingAddressID  */
    private $billingAddressID;
/* @var string $shippingAddressID  */
    private $shippingAddressID;
/* @var string $comments  */
    private $comments;
/* @var Number $shippingCost  */
    private $shippingCost;
/* @var Number $taxCost  */
    private $taxCost;
/* @var object $xp  */
    private $xp;
}
