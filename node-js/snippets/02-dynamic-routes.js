
// inside route file, i.e., userRouter.js
// getting dynamic param from the url
// ex: http://localhost:9090:/api/v2/user/234
router.param('id', userController.checkId);

router
    .route('/')
    .get(controllerName.actionName1)
    .post(controllerName.actionName2);

router
    .route('/:id')
    .put(anotherController.actionName1)
    .delete(anotherController.actionName2);

// inside controller code, i.e., userController.js
exports.checkId = (req, res, next, val) => {
    if(!req.params.id){
        return res.status(404).json({
            status: 'failed',
            message: 'Invalid Id'
        })
    }
    next();
}

exports.actionName1 = (req, res) => {
    // buisness logic
}
